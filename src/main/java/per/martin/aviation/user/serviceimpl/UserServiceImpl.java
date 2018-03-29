package per.martin.aviation.user.serviceimpl;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.realm.LoginRealm;
import per.martin.aviation.user.dao.SysUserMapper;
import per.martin.aviation.user.entity.SysUser;
import per.martin.aviation.user.service.UserService;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/26 19:38
 * @since JDK1.8
 */
@Service
public class UserServiceImpl implements UserService {

    private SysUserMapper userMapper;
    private LoginRealm loginRealm;

    @Autowired
    public UserServiceImpl(SysUserMapper userMapper,LoginRealm loginRealm) {
        this.userMapper = userMapper;
        this.loginRealm = loginRealm;
    }


    @Override
    public void login(String account, String password) throws AuthenticationException {
        UsernamePasswordToken token = new UsernamePasswordToken(account,password);
        loginRealm.doGetAuthenticationInfo(token);
    }
}
