package per.martin.aviation.calendar.service;

import per.martin.aviation.calendar.entity.SysUserEvent;

import java.util.List;

/**
 * @author williamJM
 * @version v1.0
 * createDate  2018/3/29 14:44
 * @since JDK1.8
 */
public interface EventService {
    List<SysUserEvent> getAllUserEvent(Integer userId);
}
