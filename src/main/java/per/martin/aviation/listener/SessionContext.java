package per.martin.aviation.listener;

import java.util.HashMap;
import javax.servlet.http.HttpSession;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 10:41
 * @since JDK1.8
 */

public class SessionContext {
    private static SessionContext instance;
    private HashMap<String,HttpSession> sessionMap;

    private SessionContext() {
        sessionMap = new HashMap<String,HttpSession>();
    }

    public static SessionContext getInstance() {
        if (instance == null) {
            instance = new SessionContext();
        }
        return instance;
    }

    public synchronized void AddSession(HttpSession session) {
        if (session != null) {
            sessionMap.put(session.getId(), session);
        }
    }

    public synchronized void DelSession(HttpSession session) {
        if (session != null) {
            sessionMap.remove(session.getId());
            if(session.getAttribute("userid")!=null){
                sessionMap.remove(session.getAttribute("userid").toString());
                //session.invalidate();
            }
        }
    }

    public synchronized HttpSession getSession(String session_id) {
        if (session_id == null) return null;
        return (HttpSession) sessionMap.get(session_id);
    }

    public HashMap getSessionMap() {
        return sessionMap;
    }

    public void setMymap(HashMap sessionMap) {
        this.sessionMap = sessionMap;
    }


    public void sessionHandlerByCacheMap(HttpSession session){
        String userid = session.getAttribute("userid").toString();
        if(SessionListener.sessionContext.getSessionMap().get(userid)!=null){
            HttpSession userSession=(HttpSession)SessionListener.sessionContext.getSessionMap().get(userid);
            //注销在线用户
            userSession.invalidate();
            SessionListener.sessionContext.getSessionMap().remove(userid);
            //清除在线用户后，更新map,替换map sessionid
            SessionListener.sessionContext.getSessionMap().remove(session.getId());
            SessionListener.sessionContext.getSessionMap().put(userid,session);
        } else {
            // 根据当前sessionid 取session对象。 更新map key=用户名 value=session对象 删除map
            SessionListener.sessionContext.getSessionMap().get(session.getId());
            SessionListener.sessionContext.getSessionMap().put(userid,SessionListener.sessionContext.getSessionMap().get(session.getId()));
            SessionListener.sessionContext.getSessionMap().remove(session.getId());
        }
    }

}
