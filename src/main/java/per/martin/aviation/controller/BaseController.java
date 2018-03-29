package per.martin.aviation.controller;

import per.martin.aviation.utils.ReturnFormat;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/21 21:08
 * @since JDK1.8
 */
public abstract class BaseController {

    protected String retContent(int status,Object data) {
        return ReturnFormat.retParam(status, data);
    }
}
