package cn.rc.flow.common.exception;

/**
 * @author rc
 */
public class ResourceNotFoundException extends AbstractFlowException {
    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
