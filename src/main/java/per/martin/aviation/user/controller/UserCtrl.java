package per.martin.aviation.user.controller;

import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.statuscode.StatusCode;
import per.martin.aviation.user.service.UserService;
import per.martin.aviation.utils.JSONResult;

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
    public JSONResult login(String account,String password) {
        JSONResult jsonResult = null;
        try {
            userService.login(account,password);
            jsonResult = JSONResult.getInstance(200,"success");
        } catch (AuthenticationException e) {
            jsonResult = JSONResult.getInstance(StatusCode.ACCOUNT_NOT_FOUND,e.getMessage());
            e.printStackTrace();
        }
        return jsonResult;

    }
}
