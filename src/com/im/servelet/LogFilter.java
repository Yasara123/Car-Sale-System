package com.im.servelet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//use filter that is javax.servlet
public class LogFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse responce,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest re=(HttpServletRequest)request;
		System.out.println("Called "+re.getRequestURI() +"@"+new Date());
		chain.doFilter(request, responce);//by this oni ekakata yanna denava but log gatha karala thama yanna denne 
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
