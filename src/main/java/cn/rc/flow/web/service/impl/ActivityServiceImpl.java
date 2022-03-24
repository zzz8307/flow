package cn.rc.flow.web.service.impl;

import cn.rc.flow.common.utils.UUIDUtil;
import cn.rc.flow.dao.ActivityMapper;
import cn.rc.flow.domain.Activity;
import cn.rc.flow.domain.ActivityExample;
import cn.rc.flow.web.service.ActivityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author rc
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Resource
    private ActivityMapper activityMapper;

    @Override
    public List<Activity> listActivities(String taskId) {
        ActivityExample example = new ActivityExample();
        example.createCriteria()
                .andTaskIdEqualTo(taskId);
        return activityMapper.selectByExample(example);
    }

    @Override
    public Activity insertActivity(Activity activity, String taskId, String createdBy) {
        String sysId = UUIDUtil.getUUID();
        activity.setSysId(sysId);
        activity.setTaskId(taskId);
        activity.setCreatedBy(createdBy);
        activity.setCreatedTime(new Date());
        activityMapper.insert(activity);
        return activityMapper.selectByPrimaryKey(sysId);
    }
}
