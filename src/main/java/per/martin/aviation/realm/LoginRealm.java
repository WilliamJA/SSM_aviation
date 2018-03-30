
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
 * shiro用户认证
 * @author williamJM
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

        List<SysUser> users = userMapper.selectSingleColumn("login_name","'" + usernamePasswordToken.getUsername() + "'");

        if(users.isEmpty()) {
            throw new UnknownAccountException();
        } else {
            SysUser user = users.get(0);

            Object principal = usernamePasswordToken.getUsername();
            Object credentials = user.getPassword();
            String realmName = getName();

            ByteSource salt = ByteSource.Util.bytes(usernamePasswordToken.getUsername());

             return new SimpleAuthenticationInfo(principal,credentials,salt,realmName);
        }

    }
}

