package per.martin.aviation.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import per.martin.aviation.user.dao.SysUserMapper;
import per.martin.aviation.user.entity.SysUser;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/26 20:59
 * @since JDK1.8
 */
@Component
public class LoginRealm extends AuthenticatingRealm {
    private SysUserMapper userMapper;

    @Autowired
    public LoginRealm(SysUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        List<SysUser> user = userMapper.selectBySingleColumn("login_name",usernamePasswordToken.getUsername());
        SimpleAuthenticationInfo info = null;
        if(user.size() > 0 && user.get(0) != null) {
            Object principal = user.get(0).getLoginName();
            Object credentials = user.get(0).getPassword();
            String realmName = this.getName();
            ByteSource salt = ByteSource.Util.bytes(user.get(0).getTuId());
            info = new SimpleAuthenticationInfo(principal,credentials,salt,realmName);

        } else {
            throw new AuthenticationException("该账户不存在");
        }

        return info;
    }
}
