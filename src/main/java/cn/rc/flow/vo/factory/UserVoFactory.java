package cn.rc.flow.vo.factory;

import cn.rc.flow.domain.User;
import cn.rc.flow.vo.UserVO;
import org.springframework.stereotype.Component;

/**
 * @author rc
 */
@Component
public class UserVoFactory extends AbstractVoFactory {

    public UserVO getVO(User user) {
        if (user == null) {
            return null;
        }

        return new UserVO()
                .setSysId(user.getSysId())
                .setUserName(user.getUserName())
                .setName(user.getName())
                .setManager(userConverter.convert(user.getManagerId()))
                .setGroups(groupConverter.convertGroups(user.getSysId()))
                .setEmployeeNumber(user.getEmployeeNumber())
                .setEmail(user.getEmail())
                .setPhone(user.getPhone())
                .setActive(user.getActive())
                .setLockedOut(user.getLockedOut())
                .setCreatedBy(userConverter.convert(user.getCreatedBy()))
                .setCreatedTime(user.getCreatedTime())
                .setUpdatedBy(userConverter.convert(user.getUpdatedBy()))
                .setUpdatedTime(user.getUpdatedTime())
                .setSysModCount(user.getSysModCount());
    }
}
