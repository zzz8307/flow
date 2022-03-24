package cn.rc.flow.common.exception;

/**
 * @author rc
 */
public class AuthorizationFailedException extends AbstractFlowException {
    public AuthorizationFailedException() {
    }

    public AuthorizationFailedException(String message) {
        super(message);
    }
}
