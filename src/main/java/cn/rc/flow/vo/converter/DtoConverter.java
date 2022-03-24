package cn.rc.flow.vo.converter;

/**
 * @author rc
 */
public interface DtoConverter<T> {
    /**
     * Convert record to DTO object.
     * @param sysId Record id.
     * @return DTO object.
     */
    T convert(String sysId);
}
