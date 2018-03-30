package per.martin.aviation.calendar.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.calendar.dao.SysUserEventLabelMapper;
import per.martin.aviation.calendar.dao.SysUserEventMapper;
import per.martin.aviation.calendar.entity.SysUserEvent;
import per.martin.aviation.calendar.service.EventService;

import java.util.List;

/**
 * @author williamJM
 * @version v1.0
 * createDate  2018/3/29 14:44
 * @since JDK1.8
 */
@Service
public class EventServiceImpl implements EventService {

    private SysUserEventMapper userEventMapper;

    @Autowired
    public EventServiceImpl(SysUserEventMapper userEventMapper) {
        this.userEventMapper = userEventMapper;
    }

    @Override
    public List<SysUserEvent> getAllUserEvent(Integer userId) {
        return userEventMapper.selectSingleColumn("sys_user",userId);
    }
}
