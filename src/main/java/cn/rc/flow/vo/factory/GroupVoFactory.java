package cn.rc.flow.vo.factory;

import cn.rc.flow.domain.Group;
import cn.rc.flow.vo.GroupVO;
import org.springframework.stereotype.Component;

/**
 * @author rc
 */
@Component
public class GroupVoFactory extends AbstractVoFactory {

    public GroupVO getVO(Group group) {
        if (group == null) {
            return null;
        }
        
        return new GroupVO()
                .setSysId(group.getSysId())
                .setName(group.getName())
                .setGroupEmail(group.getGroupEmail())
                .setManager(userConverter.convert(group.getManagerId()))
                .setMembers(userConverter.convertMembers(group.getSysId()))
                .setDescription(group.getDescription())
                .setCreatedBy(userConverter.convert(group.getCreatedBy()))
                .setCreatedTime(group.getCreatedTime())
                .setUpdatedBy(userConverter.convert(group.getUpdatedBy()))
                .setUpdatedTime(group.getUpdatedTime())
                .setSysModCount(group.getSysModCount());
    }
}
