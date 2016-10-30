package com.im.servelet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/user/*")
public class AuthFilter implements Filter {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session=request.getSession();
		
		System.out.println("Authenticating...");
		
		if(session.getAttribute("name")!=null){
			chain.doFilter(req, res);
		}else{
			response.sendRedirect("../login.jsp");
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
