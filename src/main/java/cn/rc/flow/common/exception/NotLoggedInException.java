package cn.rc.flow.common.exception;

/**
 * @author rc
 */
public class NotLoggedInException extends AbstractFlowException {
    public NotLoggedInException() {
    }

    public NotLoggedInException(String message) {
        super(message);
    }
}
