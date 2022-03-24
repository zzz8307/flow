package cn.rc.flow.web.controller;

import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

/**
 * @author rc
 */
public interface BaseController<T> {
    /**
     * Get records.
     * @param query Query string. See {@link cn.rc.flow.web.service.BaseService#listByCondition(String, int, int)}.
     * @param ofs Starting record index for which to begin retrieving records.
     * @param lim Maximum number of records to return.
     * @param displayValue 	Determines the type of data returned, either the actual values from the database
     *                      or the display values of the fields.
     * @return {@link ResponseEntity}
     */
    ResponseEntity<Object> listRecords(String query, Integer ofs, Integer lim, Boolean displayValue);

    /**
     * Get record by sys id.
     * @param sysId Record id.
     * @param displayValue 	Determines the type of data returned, either the actual values from the database
     *                      or the display values of the fields.
     * @return {@link ResponseEntity}
     */
    ResponseEntity<Object> getRecord(String sysId, Boolean displayValue);

    /**
     * Insert a record.
     * @param request {@link HttpServletRequest}
     * @param t Record to be inserted.
     * @param displayValue Determines the type of data returned, either the actual values from the database
     *                     or the display values of the fields.
     * @return {@link ResponseEntity}
     */
    ResponseEntity<Object> insertRecord(HttpServletRequest request, T t, Boolean displayValue);

    /**
     * Update a record
     * @param request {@link HttpServletRequest}
     * @param sysId Record id.
     * @param t Record to be inserted.
     * @param displayValue Determines the type of data returned, either the actual values from the database
     *                     or the display values of the fields.
     * @return {@link ResponseEntity}
     */
    ResponseEntity<Object> updateRecord(HttpServletRequest request, String sysId, T t, Boolean displayValue);

    /**
     * Delete record by id.
     * @param sysId Record id.
     * @return {@link ResponseEntity}
     */
    ResponseEntity<Object> deleteRecord(String sysId);
}
