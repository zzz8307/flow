package cn.rc.flow.common.exception;

/**
 * @author rc
 */
public class ResourceConcurrentModificationException extends AbstractFlowException {
    public ResourceConcurrentModificationException() {
    }

    public ResourceConcurrentModificationException(String message) {
        super(message);
    }
}
