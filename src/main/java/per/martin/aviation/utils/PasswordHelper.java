package per.martin.aviation.utils;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import per.martin.aviation.entity.TUser;

/**
 * 用户密码加密工具类
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 17:19
 * @since JDK1.8
 */
public class PasswordHelper {

    private String algorithmName = "md5";
    private final int HASHITERATIONS = 2;
    private RandomNumberGenerator randomNumberGenerator =
            new SecureRandomNumberGenerator();

    public void encryptPassword(TUser user) {

        user.setSalt(randomNumberGenerator.nextBytes().toHex());

        String newPassword = new SimpleHash(algorithmName, user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                HASHITERATIONS).toHex();
        user.setPassword(newPassword);
    }
}
