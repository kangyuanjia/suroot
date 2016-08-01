package top.suroot.base.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * log 添加
 * 
 * 在每个需要添加的类和方法上增加此注解
 * 
 * @author JYB
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE , ElementType.METHOD})
public @interface LogAnnotation {
	/**
	 * 记录登录信息
	 * @return
	 */
	String loginInfo() default "";
	/**
	 * 操作方法
	 * @return
	 */
	String operateMethod() default "";
	/**
	 * 操作功能
	 * @return
	 */
	String operateFunction() default "";
	/**
	 * 操作描述
	 * @return
	 */
	
    String operateDescribe() default "";
}
