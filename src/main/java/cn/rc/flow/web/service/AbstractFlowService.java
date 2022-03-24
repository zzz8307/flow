package cn.rc.flow.web.service;

import cn.rc.flow.common.exception.ResourceIllegalModificationException;
import cn.rc.flow.common.properties.QueryProperties;
import cn.rc.flow.common.properties.RecordProperties;
import cn.rc.flow.dao.UserMapper;
import cn.rc.flow.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static cn.rc.flow.common.consts.ErrorMessageConsts.ILLEGAL_MANAGER_ID_MESSAGE;

/**
 * @author rc
 */
@Service
public abstract class AbstractFlowService {

    @Resource
    protected RecordProperties recordProperties;
    @Resource
    protected QueryProperties queryProperties;

    @Resource
    private UserMapper userMapper;

    protected void isManagerIdValid(String managerId) {
        if (managerId == null || managerId.isBlank()) {
            return;
        }

        User manager = userMapper.selectByPrimaryKey(managerId);
        if (manager == null) {
            throw new ResourceIllegalModificationException(ILLEGAL_MANAGER_ID_MESSAGE);
        }
    }
}
