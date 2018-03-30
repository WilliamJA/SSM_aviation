package per.martin.aviation.user.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.user.service.UserService;
import per.martin.aviation.utils.ReturnFormat;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/26 20:12
 * @since JDK1.8
 */
@Controller
@RequestMapping(value = "/user")
public class UserCtrl {
    private UserService userService;

    @Autowired
    public UserCtrl(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(String account,String password) {

        Subject currentUser = SecurityUtils.getSubject();

        if(!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(account,password);
            token.setRememberMe(false);
            try {
                currentUser.login(token);
                return ReturnFormat.retParam(200,null);
            } catch (IncorrectCredentialsException ice) {
                return ReturnFormat.retParam(1012,null);
            } catch (LockedAccountException lae) {
                return ReturnFormat.retParam(1016,null);
            } catch (UnknownAccountException ue) {
                return ReturnFormat.retParam(1010,null);
            } catch (DisabledAccountException de) {
                return ReturnFormat.retParam(1013,null);
            }
        }
        return ReturnFormat.retParam(1017,null);
    }

    @RequestMapping(value = "/logout")
    @ResponseBody
    public String logout() {
        return ReturnFormat.retParam(200,null);
    }

}
