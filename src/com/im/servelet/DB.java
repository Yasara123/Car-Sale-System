package com.im.servelet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	static String url = "jdbc:mysql://localhost:3306/carsale";
	static String user = "root";
	static String pw = "";
	static String driver = "com.mysql.jdbc.Driver";
	
	static Connection con;
	
	public static Connection getCon() throws Exception{
		if(con==null){
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pw);
		}
		return con;
	}
	
}
