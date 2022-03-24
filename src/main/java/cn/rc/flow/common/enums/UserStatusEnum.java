package cn.rc.flow.common.enums;

/**
 * @author rc
 */
public enum UserStatusEnum {

    /**
     * User is active
     */
    ACTIVE("1"),

    /**
     * User is inactive
     */
    INACTIVE("0"),

    /**
     * User is locked out
     */
    LOCKED_OUT("1"),

    /**
     * User is not locked out
     */
    NOT_LOCKED_OUT("0");

    private final String code;

    UserStatusEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
