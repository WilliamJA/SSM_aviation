package per.martin.aviation.calendar.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import per.martin.aviation.calendar.entity.SysUserEventLabel ;

public interface SysUserEventLabelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event_label
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event_label
     *
     * @mbggenerated
     */
    int insert(SysUserEventLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event_label
     *
     * @mbggenerated
     */
    SysUserEventLabel selectByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event_label
     *
     * @mbggenerated
     */
    List<SysUserEventLabel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event_label
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysUserEventLabel record);

    /**
     * 查询单列
     * @author willianJM
     * @param column
     * @param value
     * @return
     */
    List<SysUserEventLabel> selectSingleColumn(@Param("column") String column,
                                               @Param("value") Object value);
}