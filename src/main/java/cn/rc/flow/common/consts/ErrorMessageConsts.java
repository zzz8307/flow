package cn.rc.flow.common.consts;

/**
 * @author rc
 */
public final class ErrorMessageConsts {

    public static final String FIELD_IS_MANDATORY_MESSAGE = "Field is mandatory.";

    public static final String USERNAME_OR_PASSWORD_WRONG_MESSAGE = "Invalid username or password.";
    public static final String NOT_LOGGED_IN_MESSAGE = "You are not logged in.";
    public static final String AUTH_METHOD_NOT_SUPPORTED_MESSAGE = "Authorization method not supported.";

    public static final String USER_NOT_FOUND_MESSAGE = "User record not found.";
    public static final String GROUP_NOT_FOUND_MESSAGE = "Group record not found.";
    public static final String MEMBER_NOT_FOUND_MESSAGE = "Member record not found.";
    public static final String INCIDENT_NOT_FOUND_MESSAGE = "Incident record not found.";
    public static final String PROBLEM_NOT_FOUND_MESSAGE = "Problem record not found.";

    public static final String CONCURRENT_MODIFICATION_MESSAGE = "Failed to update record. Maximum retries exceeded.";
    public static final String ILLEGAL_MANAGER_ID_MESSAGE = "You provided a wrong manager ID.";
    public static final String INVALID_QUERY_FIELD_MESSAGE = "Query string contains one or more invalid fields.";

    public static final String UNKNOWN_ERROR_MESSAGE = "Unknown internal error.";

    private ErrorMessageConsts() {
    }
}
