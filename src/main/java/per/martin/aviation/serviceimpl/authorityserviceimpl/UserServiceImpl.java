package per.martin.aviation.serviceimpl.authorityserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.entity.TUser;
import per.martin.aviation.mapper.authoritymapper.TUserMapper;
import per.martin.aviation.service.authorityservice.UserService;
import per.martin.aviation.utils.PasswordHelper;

import java.util.Set;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 17:16
 * @since JDK1.8
 */
@Service
public class UserServiceImpl implements UserService {

    private TUserMapper userMapper;
    private PasswordHelper passwordHelper = new PasswordHelper();

    @Autowired
    public UserServiceImpl(TUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public TUser createUser(TUser user) {
        //加密密码
        passwordHelper.encryptPassword(user);
        return userMapper.insert(user);
    }

    public void changePassword(Integer userId, String newPassword) {

    }

    public void correlationRoles(Integer userId, Integer roleIds) {

    }

    public void uncorrelationRoles(Integer userId, Integer roleIds) {

    }

    public TUser findByUsername(String username) {
        return null;
    }

    public Set<String> findRoles(String username) {
        return null;
    }

    public Set<String> findPermissions(String username) {
        return null;
    }
}
