package per.martin.aviation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import per.martin.aviation.annotation.Loggable;
import per.martin.aviation.logger.dao.SysLogMapper;

import java.lang.reflect.Method;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 18:02
 * @since JDK1.8
 */
@Aspect
@Component(value = "operationLogger")
public class OperationLogger {
    private SysLogMapper sysLogMapper;

    public SysLogMapper getSysLogMapper() {
        return sysLogMapper;
    }

    public void setSysLogMapper(SysLogMapper sysLogMapper) {
        this.sysLogMapper = sysLogMapper;
    }

    @Pointcut("execution(* *(..)) && @annotation(per.martin.aviation.annotation.Loggable)")
    public void log() {

    }

    @AfterReturning(value = "log()", returning = "retVal")
    public void log(JoinPoint point, Object retVal) {

        //获取参数
        Object[] params = point.getArgs();

        //获取方法名
        String methodName = point.getSignature().getName();

        //获取目标对象的类名
        Class<?> targetClass = point.getTarget().getClass();

        Method method = null;
        for (Method mt : targetClass.getMethods()) {
            if (methodName.equals(mt.getName())) {
                method = mt;
                break;
            }
        }

        //自定义注解
        Loggable loggable = method.getAnnotation(Loggable.class);
        if (loggable == null) {
            return;
        }

        // 描述
        String desc = loggable.description();

        // 方法名
        String optType = loggable.optType();

        // 日志模块
        String module = loggable.module();

        //选择
        if ("SELECT".equals(optType)) {
            selectLog(params, desc, module);
        } else if ("UPDATE".equals(optType)) {
            updateLog(params, desc, module);
        } else if ("INSERT".equals(optType)) {
            insert(params, desc, module);
        } else if ("DELETE".equals(optType)) {
            delete(params, desc, module);
        }

    }

    /**
     * 删除操作的日志
     * @param params
     * @param desc
     * @param module
     */
    private void delete(Object[] params, String desc, String module) {

    }

    /**
     * 插入操作的日志
     * @param params
     * @param desc
     * @param module
     */
    private void insert(Object[] params, String desc, String module) {

    }

    /**
     * 更新操作的日志
     * @param params
     * @param desc
     * @param module
     */
    private void updateLog(Object[] params, String desc, String module){
        if("room_log".equals(module)){  //房间日志表
           /* RoomKeep room=(RoomKeep) params[0];
            RoomLog roomLog=new RoomLog();
            roomLog.setRoomno(room.getRoomno());
            roomLog.setOptTime(new Date());
            roomLog.setSysTime(this.hotelInfoDao.getSysTime("00001"));
            roomLog.setMemo(room.getMemo());
            roomLog.setOptMan(room.getTheMan());
            roomLog.setSubstoreid(room.getSubstoreid());
            roomLog.setContent(desc);
            roomLog.setLogType("UPDATE");
            roomLog.setOptType(room.getMemo());
            roomLog.setSource("客户端");
            this.logDao.insertRoomLog(roomLog);*/
        }
    }

    /**
     * 查询操作的日志
     * @param params
     * @param desc
     * @param module
     */
    private void selectLog(Object[] params, String desc, String module) {

    }

}

