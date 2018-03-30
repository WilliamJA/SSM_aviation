package per.martin.aviation.calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.calendar.entity.SysUserEventLabel;
import per.martin.aviation.calendar.service.EventLabelService;
import per.martin.aviation.statuscode.StatusCode;
import per.martin.aviation.user.entity.SysUser;
import per.martin.aviation.utils.JSONResult;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author williamJM
 * @version v1.0
 * createDate  2018/3/29 14:28
 * @since JDK1.8
 */
@Controller
@RequestMapping(value = "/eventLabel")
public class EventLabelCtrl {
    private EventLabelService eventLabelService;

    @Autowired
    public EventLabelCtrl(EventLabelService eventLabelService) {
       this.eventLabelService = eventLabelService;
    }

    @RequestMapping(value = "/getAllEventLabel")
    @ResponseBody
    public JSONResult getAllEventLabel(HttpSession session) {
        SysUser user = null;
        try {
            user = (SysUser) session.getAttribute("user");
            List<SysUserEventLabel> res = eventLabelService.getAllLabel(user.getTuId());
            return JSONResult.getInstance(StatusCode.SELECT_SUCCESS,"success",res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSONResult.getInstance(StatusCode.SERVER_ERROR,"error");
    }
}
