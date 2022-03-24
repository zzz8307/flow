package cn.rc.flow.vo;

/**
 * @author rc
 */
public class ExceptionVO {
    private String message;

    public ExceptionVO() {
    }

    public ExceptionVO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ExceptionVO{" +
                "message='" + message + '\'' +
                '}';
    }
}
