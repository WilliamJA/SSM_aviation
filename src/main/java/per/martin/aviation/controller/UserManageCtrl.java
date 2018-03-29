package per.martin.aviation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.entity.TRole;
import per.martin.aviation.entity.TUser;
import per.martin.aviation.service.authorityservice.UserManageService;
import per.martin.aviation.service.authorityservice.UserService;
import per.martin.aviation.vo.UserRoleRes;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 13:17
 * @since JDK1.8
 */
@Controller
@RequestMapping(value = "/userManagement")
public class UserManageCtrl {
    private UserManageService userManageService;
    private UserService userService;

    @Autowired
    public UserManageCtrl(UserManageService userManageService,
                          UserService userService) {
        this.userManageService = userManageService;
        this.userService = userService;
    }

    @RequestMapping(value = "/getAllUserRole.action")
    @ResponseBody
    public List<UserRoleRes> getAllUserRole() {
        return userManageService.getUserRoleResList();
    }

    @RequestMapping(value = "/getAllRole.action")
    @ResponseBody
    public List<TRole> getAllRole() {
        return userManageService.getAllRole();
    }

    @RequestMapping(value = "/test.action")
    public TUser test (TUser user) {
        return userService.createUser(user);
    }
}
