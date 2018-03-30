package per.martin.aviation.calendar.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.calendar.dao.SysUserEventLabelMapper;
import per.martin.aviation.calendar.entity.SysUserEventLabel;
import per.martin.aviation.calendar.service.EventLabelService;

import java.util.List;

/**
 * @author williamJM
 * @version v1.0
 * createDate  2018/3/29 14:16
 * @since JDK1.8
 */
@Service
public class EventLabelServiceImpl implements EventLabelService {
    private SysUserEventLabelMapper labelMapper;

    @Autowired
    public EventLabelServiceImpl(SysUserEventLabelMapper labelMapper) {
        this.labelMapper = labelMapper;
    }

    @Override
    public List<SysUserEventLabel> getAllLabel(Integer userId) {
        return labelMapper.selectSingleColumn("sys_user",userId);
    }
}
