package cn.rc.flow.web.handler;

import cn.rc.flow.common.annotation.ExceptionLogger;
import cn.rc.flow.common.exception.*;
import cn.rc.flow.vo.ExceptionVO;
import com.google.common.base.CaseFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import static cn.rc.flow.common.consts.ErrorMessageConsts.UNKNOWN_ERROR_MESSAGE;

/**
 * @author rc
 */
@ControllerAdvice
@RestController
@ExceptionLogger
public class FlowExceptionHandler {

    @ExceptionHandler({AuthorizationFailedException.class, NotLoggedInException.class})
    public ResponseEntity<ExceptionVO> authException(AbstractFlowException e) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.WWW_AUTHENTICATE, "Basic realm=\"flow API\"");
        return new ResponseEntity<>(new ExceptionVO(e.getMessage()), httpHeaders, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionVO> notFoundException(ResourceNotFoundException e) {
        return new ResponseEntity<>(new ExceptionVO(e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceNotModifiedException.class)
    public ResponseEntity<ExceptionVO> notModifiedException(ResourceNotModifiedException e) {
        return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @ExceptionHandler(ResourceConcurrentModificationException.class)
    public ResponseEntity<ExceptionVO> concurrentModException(ResourceConcurrentModificationException e) {
        return new ResponseEntity<>(new ExceptionVO(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceIllegalModificationException.class)
    public ResponseEntity<ExceptionVO> illegalModException(ResourceIllegalModificationException e) {
        return new ResponseEntity<>(new ExceptionVO(e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ExceptionVO> invalidArgsException(BindException e) {
        StringBuilder sb = new StringBuilder();
        e.getBindingResult().getFieldErrors().forEach(error -> {
            // convert to snake_case naming convention
            String field = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, error.getField());
            String message = error.getDefaultMessage();
            sb.append("'").append(field).append("': ").append(message).append(" ");
        });
        sb.deleteCharAt(sb.length() - 1);
        return new ResponseEntity<>(new ExceptionVO(sb.toString()), HttpStatus.BAD_REQUEST);
    }

    //@ExceptionHandler
    public ResponseEntity<ExceptionVO> unhandledException(Exception e) {
        return new ResponseEntity<>(new ExceptionVO(UNKNOWN_ERROR_MESSAGE), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
