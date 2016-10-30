package com.im.servelet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class PostServelet
 */
@WebServlet("/PostCar")
public class PostServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String brand= request.getParameter("brand");
		String model= request.getParameter("model");
		String title= request.getParameter("title");
		String description= request.getParameter("description");
		String price= request.getParameter("price");
		
		String sql = "INSERT INTO Store (brand,model,title,description,price,image) VALUES (?,?,?,?,?,?)";
		try{
			//get connection
		Connection con = DB.getCon();
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		ps.setString(1,brand);
		ps.setString(2,model);
		ps.setString(3,title);
		ps.setString(4,description);
		ps.setString(5,price);
		ps.setString(6,"images/default.png");
		ps.executeUpdate();
		
		//generate the responce
		response.sendRedirect("success.jsp");
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
