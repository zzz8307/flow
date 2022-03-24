package cn.rc.flow.web.service;

import cn.rc.flow.domain.Activity;

import java.util.List;

/**
 * @author rc
 */
public interface ActivityService {
    /**
     * Get activity list by task id
     * @param taskId Task id
     * @return Activity list.
     */
    List<Activity> listActivities(String taskId);

    /**
     * Insert an activity for a task
     * @param activity Activity record
     * @param taskId Task id
     * @param createdBy Sys id of the user who initiated the request.
     * @return Inserted activity record
     */
    Activity insertActivity(Activity activity, String taskId, String createdBy);
}
