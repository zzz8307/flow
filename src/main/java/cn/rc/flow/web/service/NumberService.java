package cn.rc.flow.web.service;

/**
 * @author rc
 */
public interface NumberService {
    /**
     * Get the next available number
     * @param tableName Name of the table that needs to be counted
     * @param updatedBy Sys id of the user who initiated the request
     * @return Next available number. Return {@code null} if max retries exceeded.
     */
    String getNextNumber(String tableName, String updatedBy);
}
