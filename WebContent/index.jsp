<%@page import="com.im.servelet.DB"%>
<%@page import="com.mysql.jdbc.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Sale</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>

<jsp:include page="/WEB-INF/jspf/header.jsp"></jsp:include>
<div id="content">
<%
String sql="SELECT * FROM Store";
try{
	Connection con =(Connection) DB.getCon();
	PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
	ResultSet rs=(ResultSet)ps.executeQuery();
	while(rs.next()){
		String title = rs.getString("title");
		String description= rs.getString("description");
		String price = rs.getString("price");
		String image= rs.getString("image");
%>
<div class="car">
		<img  src="" width="150" hight="150">
		<h2>CarTitle</h2>
		<p>Description</p>
		<h5>Price</h5>
	</div>
	<br/>
<%		
	}
}catch(Exception e){
	e.printStackTrace();
}
%>
	
	

</div>
<jsp:include page="/WEB-INF/jspf/footer.jsp"></jsp:include>
</body>
</html>