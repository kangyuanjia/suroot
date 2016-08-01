package top.suroot.base.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter implements Filter {
	
	private String test ;
	
	
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	public void destroy() {
		
		// TODO Auto-generated method stub
		System.out.println("Filter 2 destroy ....");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(test + " Filter 2 do Filter ....");
		chain.doFilter(request, response);
		System.out.println("this is Filter 2 after do Filter not avilable!");
		
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Filter 2 filter init ......");
	}
	

}
