package per.martin.aviation.calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.calendar.entity.SysUserEvent;
import per.martin.aviation.calendar.service.EventService;
import per.martin.aviation.statuscode.StatusCode;
import per.martin.aviation.user.entity.SysUser;
import per.martin.aviation.utils.JSONResult;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author williamJM
 * @version v1.0
 * createDate  2018/3/29 14:48
 * @since JDK1.8
 */
@Controller
@RequestMapping(value = "userEvent")
public class EventCtrl {
    private EventService eventService;

    @Autowired
    public EventCtrl(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/getAllUserEvent")
    @ResponseBody
    public JSONResult getAllUserEvent(HttpSession session) {
        try {
            SysUser user = (SysUser) session.getAttribute("user");
            List<SysUserEvent> res = eventService.getAllUserEvent(user.getTuId());
            return JSONResult.getInstance(StatusCode.SELECT_SUCCESS,"success",res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSONResult.getInstance(StatusCode.SERVER_ERROR,"success");
    }
}
