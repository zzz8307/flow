package cn.rc.flow.web.controller;

import cn.rc.flow.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author rc
 */
public abstract class AbstractFlowController {
    protected static final String CURRENT_USER_SESSION = "currentUser";

    protected User getSessionUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(CURRENT_USER_SESSION);
    }
}
