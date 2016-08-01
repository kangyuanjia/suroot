package top.suroot.base.controller;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.suroot.base.aop.LogAnnotation;
import top.suroot.base.service.BaseService;




@Controller
@RequestMapping("/base")
@LogAnnotation
public class BaseController {
	
	@Autowired
	BaseService baseService ;
	
	@RequestMapping("/hello")
	public String helloWorld(HttpServletRequest request,HttpServletResponse response){
		System.out.println("baseContrller!");

		return "hello";
	}
	@RequestMapping("annotation")
	@LogAnnotation(loginInfo = "info" ,operateDescribe = "Test", operateFunction = "log" ,operateMethod = "log")
	public String myAnnotation(HttpServletRequest request,HttpServletResponse response){
		//System.out.println("自定义注解");
		baseService.changeDataSource();
		baseService.log();
		return "hello";
	}
	
	
}

