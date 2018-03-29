package per.martin.aviation.utils;

import java.io.Serializable;
import com.alibaba.fastjson.JSON;

/**
 * 返回客户端统一格式，包括状态码，提示信息，以及业务数据
 * @author martin
 * @version v1.0
 * createDate  2018/3/21 20:10
 * @since JDK1.8
 */
public class JSONResult implements Serializable{

    //状态码
    private int status;
    //必要的提示信息
    private String message;
    //业务数据
    private Object data;

    public static JSONResult getInstance(int status, String message) {
        return new JSONResult(status,message);
    }

    public static JSONResult getInstance(int status, String message, Object data) {
        return new JSONResult(status, message, data);
    }


    public JSONResult(int status, String message){
        this.status = status;
        this.message = message;
    }


    public JSONResult(int status,String message,Object data){
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toString(){
        if(null == this.data){
            this.setData(new Object());
        }
        return JSON.toJSONString(this);
    }

}