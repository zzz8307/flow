package cn.rc.flow.web.service;

import cn.rc.flow.domain.Incident;
import cn.rc.flow.dto.NumberShortDescDTO;

/**
 * @author rc
 */
public interface IncidentService extends BaseService<Incident> {
    /**
     * Get number and short description by record id.
     * @param sysId record id
     * @return An object containing number and short description.
     */
    NumberShortDescDTO getNumberShortDesc(String sysId);
}
