package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 16:15
 * @since JDK1.8
 */
public class TestShiro {

    @Test
    public void testShiro() {

        //安全管理
        Factory<SecurityManager> factory =
                new IniSecurityManagerFactory("F:\\SSM_aviation\\src\\main\\resources\\shiro\\shiro.ini");

        SecurityManager securityManager = factory.getInstance();

        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("martin", "456");
        try {
            //4、登录，即身份验证
            subject.login(token);
        } catch (AuthenticationException e) {
            //5、身份验证失败
        }

        //断言用户已经登录
        Assert.assertEquals(true, subject.isAuthenticated());
        //6、退出
        //subject.logout();

    }

    @Test
    public void testBase64() {
        String str = "hello world";

        String encodingStr = Base64.encodeToString(str.getBytes());
        String encodingStrHex = Hex.encodeToString(str.getBytes());

        System.out.println(encodingStr);
        System.out.println(encodingStrHex);

        String deEncoding = Base64.decodeToString(encodingStr);
        System.out.println(deEncoding);

        double salt = Math.random();
        String md5Hash = new Md5Hash(str,String.valueOf(salt)).toString();
        System.out.println(md5Hash);


    }

}
