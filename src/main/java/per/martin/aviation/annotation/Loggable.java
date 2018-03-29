package per.martin.aviation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定注解记录日志
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 17:22
 * @since JDK1.8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Loggable {

    /**
     * 操作类型(insert update delete select)
     * @return
     */
    public String optType();

    /**
     * 操作描述
     * @return
     */
    public String description();

    /**
     * 日志模块，不同模块的日志保存到不同的日志表中
     * @return
     */
    public String module();

}
