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
    public static final int SELECT_SUCCESS = 10001;
    public static final int UPDATE_SUCCESS = 10002;
    public static final int DELETE_SUCCESS = 10003;

    public static final int INSERT_SUCCESS = 10004;

    //用户名不存在
    public static final int ACCOUNT_NOT_FOUND = 10005;


}
