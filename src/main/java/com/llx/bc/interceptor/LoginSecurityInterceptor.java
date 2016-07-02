package com.llx.bc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.llx.bc.entity.User;


public class LoginSecurityInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception exception)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * postHandle是进行处理器拦截用的,在control执行之后，视图渲染之前调用
	 * 这个方法只会在当前这个Interceptor的preHandle方法返回值为true的时候才会执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView model)
			throws Exception {
		// TODO Auto-generated method stub
		User user = (User) request.getSession().getAttribute("user");
		model.addObject("user", user);
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		// TODO Auto-generated method stub
		User user = (User) request.getSession().getAttribute("user");  
        if(user==null){
        	System.out.println("没有登录");
        	response.sendRedirect("/BarrageCloud/login");
        	return false;
        }else{
        	return true;  
        }
	}

}
