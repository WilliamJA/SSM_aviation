package per.martin.aviation.calendar.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import per.martin.aviation.calendar.entity.SysUserEvent ;

public interface SysUserEventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer eventId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event
     *
     * @mbggenerated
     */
    int insert(SysUserEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event
     *
     * @mbggenerated
     */
    SysUserEvent selectByPrimaryKey(Integer eventId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event
     *
     * @mbggenerated
     */
    List<SysUserEvent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_event
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysUserEvent record);

    List<SysUserEvent> selectSingleColumn(@Param("column") String column,
                                          @Param("value") Object value);
}