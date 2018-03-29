package per.martin.aviation.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 10:40
 * @since JDK1.8
 */


public class SessionListener implements HttpSessionListener {
    public static SessionContext sessionContext = SessionContext.getInstance();

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        sessionContext.AddSession(httpSessionEvent.getSession());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        sessionContext.DelSession(httpSessionEvent.getSession());
    }
}
