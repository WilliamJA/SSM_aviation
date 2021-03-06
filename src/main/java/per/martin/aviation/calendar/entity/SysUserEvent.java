package per.martin.aviation.calendar.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user_event
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class SysUserEvent {
    /**
     * event_id
     */
    private Integer eventId;

    /**
     * 事件标签id
     * label_id
     */
    private Integer labelId;

    /**
     * 开始时间
     * start
     */
    private Date start;

    /**
     * 结束时间
     * end
     */
    private Date end;

    /**
     * 是否是全天事件（0：否，1：是）
     * is_all_day
     */
    private Integer isAllDay;

    /**
     * sys_user
     */
    private Integer sysUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_event.event_id
     *
     * @return the value of sys_user_event.event_id
     *
     * @mbggenerated
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_event.event_id
     *
     * @param eventId the value for sys_user_event.event_id
     *
     * @mbggenerated
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_event.label_id
     *
     * @return the value of sys_user_event.label_id
     *
     * @mbggenerated
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_event.label_id
     *
     * @param labelId the value for sys_user_event.label_id
     *
     * @mbggenerated
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_event.start
     *
     * @return the value of sys_user_event.start
     *
     * @mbggenerated
     */
    public Date getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_event.start
     *
     * @param start the value for sys_user_event.start
     *
     * @mbggenerated
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_event.end
     *
     * @return the value of sys_user_event.end
     *
     * @mbggenerated
     */
    public Date getEnd() {
        return end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_event.end
     *
     * @param end the value for sys_user_event.end
     *
     * @mbggenerated
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_event.is_all_day
     *
     * @return the value of sys_user_event.is_all_day
     *
     * @mbggenerated
     */
    public Integer getIsAllDay() {
        return isAllDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_event.is_all_day
     *
     * @param isAllDay the value for sys_user_event.is_all_day
     *
     * @mbggenerated
     */
    public void setIsAllDay(Integer isAllDay) {
        this.isAllDay = isAllDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_event.sys_user
     *
     * @return the value of sys_user_event.sys_user
     *
     * @mbggenerated
     */
    public Integer getSysUser() {
        return sysUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_event.sys_user
     *
     * @param sysUser the value for sys_user_event.sys_user
     *
     * @mbggenerated
     */
    public void setSysUser(Integer sysUser) {
        this.sysUser = sysUser;
    }
}