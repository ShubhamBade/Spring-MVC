package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@SuppressWarnings("deprecation")
public class MyInterSepter extends HandlerInterceptorAdapter{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Request Interspeted before Handle");
		String name=request.getParameter("name");
		if(name.startsWith("s")) {
			response.getWriter().print("Invalid name oocured : Name should not strat with S");
			return false;
		}
			
		return true;
	}
 

}
