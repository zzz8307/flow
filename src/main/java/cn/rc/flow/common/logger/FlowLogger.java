package cn.rc.flow.common.logger;

import cn.rc.flow.common.exception.AbstractFlowException;
import cn.rc.flow.common.utils.UUIDUtil;
import cn.rc.flow.dao.ApiCallHistoryMapper;
import cn.rc.flow.domain.ApiCallHistory;
import cn.rc.flow.domain.User;
import cn.rc.flow.web.service.NumberService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

import static cn.rc.flow.common.consts.TableNameConsts.TABLE_API_CALL_HISTORY;

/**
 * @author rc
 */
@Aspect
@Component
public class FlowLogger {
    public static final Logger logger = LoggerFactory.getLogger(FlowLogger.class);

    private static final String CURRENT_USER_SESSION = "currentUser";

    private String historyId;
    private long duration;
    private boolean loggable = false;
    private StopWatch watch;

    @Resource
    private NumberService numberService;
    @Resource
    private ApiCallHistoryMapper apiCallHistoryMapper;

    @Pointcut("@within(cn.rc.flow.common.annotation.LogExecutionTime) || @annotation(cn.rc.flow.common.annotation.LogExecutionTime)")
    public void logExecutionTime() {}

    @Pointcut("@within(cn.rc.flow.common.annotation.apiCallHistoryLogger) || @annotation(cn.rc.flow.common.annotation.apiCallHistoryLogger)")
    public void apiCallHistoryLogger() {}

    @Pointcut("@within(cn.rc.flow.common.annotation.ExceptionLogger) || @annotation(cn.rc.flow.common.annotation.ExceptionLogger)")
    public void exceptionLogger() {}

    @Around("logExecutionTime()")
    public Object logExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        watch = new StopWatch();
        watch.start();
        Object proceed = pjp.proceed();
        if (watch.isRunning()) {
            watch.stop();
            duration = watch.getTotalTimeMillis();
        }
        logger.debug("{}#{}() executed in {} ms", pjp.getSignature().getDeclaringTypeName(), pjp.getSignature().getName(), duration);
        return proceed;
    }

    @Before("apiCallHistoryLogger()")
    public void logRequest(JoinPoint jp) throws JsonProcessingException {
        logger.debug("IP {}: {}#{}() args: {}", getIp(), jp.getSignature().getDeclaringTypeName(), jp.getSignature().getName(), jp.getArgs());

        ApiCallHistory historyObj = getRequestHistoryObj();

        if (historyObj == null) {
            return;
        }

        apiCallHistoryMapper.insertSelective(historyObj);
    }

    @AfterReturning(value = "apiCallHistoryLogger() || exceptionLogger()", returning = "res")
    public void logResponse(Object res) throws JsonProcessingException {
        if (watch.isRunning()) {
            watch.stop();
            duration = watch.getTotalTimeMillis();
        }
        logger.debug("IP {}: return: {}", getIp(), res);

        ApiCallHistory historyObj = getResponseHistoryObj(res);

        if (historyObj == null) {
            return;
        }

        apiCallHistoryMapper.updateByPrimaryKeySelective(historyObj);
    }

    @AfterThrowing(value = "apiCallHistoryLogger()", throwing = "e")
    public void logException(Exception e) {
        if (!(e instanceof AbstractFlowException)) {
            logger.error("IP {}: {}", getIp(), e.getMessage(), e);
        }
        logger.warn("IP {}: {}", getIp(), e.getMessage());
    }

    private String getIp() {
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getRemoteAddr();
    }

    private ApiCallHistory getRequestHistoryObj() throws JsonProcessingException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        if ("get".equalsIgnoreCase(request.getMethod())) {
            loggable = false;
            return null;
        }
        loggable = true;

        String currentUserId = ((User) request.getSession().getAttribute(CURRENT_USER_SESSION)).getSysId();
        String number = numberService.getNextNumber(TABLE_API_CALL_HISTORY, currentUserId);
        ObjectMapper objectMapper = new ObjectMapper();

        ApiCallHistory history = new ApiCallHistory();
        history.setSysId(UUIDUtil.getUUID());
        history.setNumber(number);
        history.setIpAddress(request.getRemoteAddr());
        history.setSenderId(currentUserId);
        history.setMethod(request.getMethod());
        history.setEndpoint(request.getRequestURL().toString());
        history.setRequestBody(objectMapper.writeValueAsString(request.getParameterMap()));
        history.setCreatedTime(new Date());

        historyId = history.getSysId();
        return history;
    }

    private ApiCallHistory getResponseHistoryObj(Object res) throws JsonProcessingException {
        if (!(res instanceof ResponseEntity)){
            return null;
        }

        if (!loggable || historyId == null) {
            return null;
        }

        ResponseEntity response = (ResponseEntity) res;
        ObjectMapper objectMapper = new ObjectMapper();

        ApiCallHistory history = new ApiCallHistory();
        history.setSysId(historyId);
        history.setHttpStatus(response.getStatusCodeValue());
        history.setDutation((int) duration);
        history.setResponseBody(objectMapper.writeValueAsString(response.getBody()));

        loggable = false;
        return history;
    }
}
