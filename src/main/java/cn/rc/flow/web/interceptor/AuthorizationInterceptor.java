package cn.rc.flow.web.interceptor;

import cn.rc.flow.common.exception.NotLoggedInException;
import cn.rc.flow.domain.User;
import cn.rc.flow.web.service.UserService;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static cn.rc.flow.common.consts.ErrorMessageConsts.NOT_LOGGED_IN_MESSAGE;

/**
 * @author rc
 */
public class AuthorizationInterceptor implements HandlerInterceptor {

    private static final String CURRENT_USER_SESSION = "currentUser";

    @Resource
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null) {
            if (request.getSession().getAttribute(CURRENT_USER_SESSION) == null) {
                throw new NotLoggedInException(NOT_LOGGED_IN_MESSAGE);
            }
        } else {
            User currentUser = userService.validateBasicAuthorization(authHeader);
            request.getSession().setAttribute(CURRENT_USER_SESSION, currentUser);
        }
        return true;
    }
}
