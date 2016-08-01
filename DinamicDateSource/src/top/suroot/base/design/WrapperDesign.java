package top.suroot.base.design;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class WrapperDesign extends HttpServletRequestWrapper {

	public WrapperDesign(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Enumeration getParameterNames() {
		Enumeration parameterNames = super.getParameterNames();
		
		return super.getParameterNames();
	}
	@Override
	public String getParameter(String name) {
		String entity = super.getParameter(name);
		//TO DO WHAT YOU WANT TO CHANGE ON ENTITY!
		return entity;
	}
	/**
	 * 获取前台页面传入的值，可以对传入的值进行修改
	 */
	@Override
	public String[] getParameterValues(String name) {
		String[] entity = super.getParameterValues(name);
		//TO DO WHAT YOU WANT TO CHANGE ON ENTITY!
		return super.getParameterValues(name);
	}
	
}
