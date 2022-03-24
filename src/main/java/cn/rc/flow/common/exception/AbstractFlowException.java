package cn.rc.flow.common.exception;

/**
 * @author rc
 */
public abstract class AbstractFlowException extends RuntimeException {
    protected AbstractFlowException() {
    }

    protected AbstractFlowException(String message) {
        super(message);
    }
}
