package cn.zyblogs.zhang;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Class: ApiServer.java
 * @Description: 服务器相关信息 RetentionPolicy.RUNTIME运行时
 *                  ElementType.TYPE 类上的注解标识
 * @Author ZhangYB
 * @Version V1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiServer {

    String value() default "";
}
