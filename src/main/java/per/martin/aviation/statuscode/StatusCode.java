package per.martin.aviation.statuscode;

import java.io.Serializable;

/**
 * 数据操作状态码
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 8:59
 * @since JDK1.8
 */
public class StatusCode implements Serializable {

    //查询成功
    public static final int SELECT_SUCCESS = 10001;

    //更新成功
    public static final int UPDATE_SUCCESS = 10002;

    //删除成功
    public static final int DELETE_SUCCESS = 10003;

    //服务器错误
    public static final int SERVER_ERROR = 10500;

    //插入成功
    public static final int INSERT_SUCCESS = 10004;

    //用户名不存在
    public static final int ACCOUNT_NOT_FOUND = 10005;

    //账户已被禁用
    public static final int ACCOUNT_ISDISABLED = 10006;

    //密码错误
    public static final int PASSWPRD_ERROR = 10007;

    //账户被禁用


}
