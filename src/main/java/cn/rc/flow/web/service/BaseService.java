package cn.rc.flow.web.service;

import java.util.List;

/**
 * @author rc
 */
public interface BaseService<T> {
    /**
     * Get all records.
     * @param offset Starting record index for which to begin retrieving records.
     * @param limit Maximum number of records to return.
     * @return Record list.
     */
    List<T> listAll(int offset, int limit);

    /**
     * Get record
     * @param query Query condition
     *          <p>Syntax: {@code query=<field><operator><value>[<operator><field><operator><value>]}</p>
     *          <p>operator:</p>
     *          <ul>
     *              <li>{@code =}: Exactly matches &lt;value&gt;</li>
     *              <li>{@code !=}: Does not match &lt;value&gt;</li>
     *              <li>{@code LIKE}: Contains the specified string.</li>
     *              <li>{@code STARTSWITH}: Starts with the specified string.</li>
     *              <li>{@code ENDSWITH}: Ends with the specified string.</li>
     *              <li>{@code ^}: Logically AND</li>
     *              <li>{@code ^OR}: Logically OR</li>
     *              <li>{@code ^ORDERBY}: Sort ascending</li>
     *              <li>{@code ^ORDERBYDESC}: Sort descending</li>
     *          </ul>
     * @param offset Starting record index for which to begin retrieving records.
     * @param limit Maximum number of records to return.
     * @return Record list that matches the condition, or empty list if no matching record.
     */
    List<T> listByCondition(String query, int offset, int limit);

    /**
     * Get record by sys id.
     * @param sysId Record id.
     * @return Query record.
     */
    T get(String sysId);

    /**
     * Insert a record.
     * @param t Record to be inserted.
     * @param createdBy Sys id of the user who initiated the request.
     * @return Inserted record.
     */
    T insert(T t, String createdBy);

    /**
     * Update a record and skip the {@code null} field.
     * @param sysId Record id.
     * @param t Record to be updated.
     * @param updatedBy Sys id of the user who initiated the request.
     * @return Updated record.
     */
    T updateSelective(String sysId, T t, String updatedBy);

    /**
     * Delete record by id.
     * @param sysId Record id.
     */
    void delete(String sysId);

}
