package com.im.servelet;
import java.sql.Connection;
//import java.sql.preparedstatement;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mysql.jdbc.PreparedStatement;

@WebServlet("/RegisterServelet")
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the request
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirm=request.getParameter("confirm");
		String error = "";
		
		if((password.equals(confirm))){
			
		}else{
			error="passward doen't mach <br/>";
		}
		if((email.contains("@"))){
			
		}else{
			error+="email not valid <br/>";
		}
		
		
		if(error.equals("")){
			//success
			String sql = "INSERT INTO member (name,email,password) VALUES (?,?,?)";
			try{
				//get connection
			Connection con = DB.getCon();
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.executeUpdate();
			
			//generate the responce
			response.sendRedirect("ThankYou.jsp");
			}catch (Exception e){
				e.printStackTrace();
			}
		}else {
			//failed
			response.sendRedirect("error.jsp"+error);
		}
	}

}













