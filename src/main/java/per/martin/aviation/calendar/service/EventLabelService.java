package per.martin.aviation.calendar.service;

import per.martin.aviation.calendar.entity.SysUserEventLabel;

import java.util.List;

/**
 * 用户日历标签service
 * @author martin
 * @version v1.0
 * createDate  2018/3/29 14:14
 * @since JDK1.8
 */
public interface EventLabelService {
    /**
     * 获取所有用户日历标签
     * @return
     */
    List<SysUserEventLabel> getAllLabel(Integer userId);
}
