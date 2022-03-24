package cn.rc.flow.vo.factory;

import cn.rc.flow.vo.converter.DdicDisplayValueConverter;
import cn.rc.flow.vo.converter.GroupSysIdNameConverter;
import cn.rc.flow.vo.converter.UserSysIdNameConverter;

import javax.annotation.Resource;

/**
 * @author rc
 */
public abstract class AbstractVoFactory {

    @Resource
    protected UserSysIdNameConverter userConverter;

    @Resource
    protected GroupSysIdNameConverter groupConverter;

    @Resource
    protected DdicDisplayValueConverter valueConverter;
}
