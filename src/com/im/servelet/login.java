package com.im.servelet;
import java.sql.Connection;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class login
 */
@WebServlet("/Login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String sql = "SELECT * FROM member WHERE email=? AND password=?";
		try{
			//get connection
		Connection con = DB.getCon();
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
	
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet  rs = (ResultSet) ps.executeQuery();
		
			if(rs.next()){
			//sucess
				HttpSession session = request.getSession();
				session.setAttribute("name", rs.getString("name"));//session controlling to check where they are log 
				
				response.sendRedirect("index.jsp");
				
			}else{
			//fail
				response.sendRedirect("error.jsp"+"user name or password incorrect");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
