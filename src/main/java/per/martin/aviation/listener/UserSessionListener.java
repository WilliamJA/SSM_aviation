package per.martin.aviation.listener;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import per.martin.aviation.user.entity.SysUser;

import javax.servlet.http.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 9:58
 * @since JDK1.8
 */
public class UserSessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    private static final Log log = LogFactory.getLog(UserSessionListener.class);

    //保存当前所有登录的用户
    public static Map<String,HttpSession> users = new HashMap<String, HttpSession>();

    public static String SESSION_LOGIN_NAME = "user";

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }

    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

        // 如果添加的属性是用户名, 则加入map中
        if(httpSessionBindingEvent.getName().equals(SESSION_LOGIN_NAME)) {
            SysUser user = (SysUser) httpSessionBindingEvent.getValue();
            HttpSession session = users.remove(user.getUserName());

            if (session != null) {
                session.removeAttribute("user");
            }
            users.put(user.getUserName(), httpSessionBindingEvent.getSession());
        }

    }

    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        // 如果移除的属性是用户名, 则从map中移除
        if (httpSessionBindingEvent.getName().equals(SESSION_LOGIN_NAME)) {
            try {
                SysUser u = (SysUser) httpSessionBindingEvent.getSession().getAttribute("user");
                users.remove(u.getUserName());
            } catch (Exception e) {
                log.debug(e);
            }
        }

    }

    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
