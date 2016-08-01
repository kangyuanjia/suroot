package top.suroot.base.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before("@annotation(top.suroot.base.aop.LogAnnotation)")
	public void logBefore(){
		System.out.println("logAopbefore");
	}
	@After("@annotation(top.suroot.base.aop.LogAnnotation)")
	public void logAfter(){
		System.out.println("logAopbefore");
	}
}
