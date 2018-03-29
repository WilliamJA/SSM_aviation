package per.martin.aviation.logger.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_log
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class SysLog {
    /**
     * sys_log_id
     */
    private Integer sysLogId;

    /**
     * 操作类型
     * type
     */
    private String type;

    /**
     * 操作人
     * user
     */
    private String user;

    /**
     * 内容
     * content
     */
    private String content;

    /**
     * 操作时间
     * datetime
     */
    private Date datetime;

    /**
     * 异常信息
     * exception
     */
    private String exception;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.sys_log_id
     *
     * @return the value of sys_log.sys_log_id
     *
     * @mbggenerated
     */
    public Integer getSysLogId() {
        return sysLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.sys_log_id
     *
     * @param sysLogId the value for sys_log.sys_log_id
     *
     * @mbggenerated
     */
    public void setSysLogId(Integer sysLogId) {
        this.sysLogId = sysLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.type
     *
     * @return the value of sys_log.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.type
     *
     * @param type the value for sys_log.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.user
     *
     * @return the value of sys_log.user
     *
     * @mbggenerated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.user
     *
     * @param user the value for sys_log.user
     *
     * @mbggenerated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.content
     *
     * @return the value of sys_log.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.content
     *
     * @param content the value for sys_log.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.datetime
     *
     * @return the value of sys_log.datetime
     *
     * @mbggenerated
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.datetime
     *
     * @param datetime the value for sys_log.datetime
     *
     * @mbggenerated
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.exception
     *
     * @return the value of sys_log.exception
     *
     * @mbggenerated
     */
    public String getException() {
        return exception;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.exception
     *
     * @param exception the value for sys_log.exception
     *
     * @mbggenerated
     */
    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }
}