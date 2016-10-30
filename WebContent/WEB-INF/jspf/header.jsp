<div id="header">
<h1> Car Sale</h1>
<p> Find your dream car </p>
<% 
if(session.getAttribute("name")!= null){
	//Loged in
%>

<a href="post.jsp">POST YOUR CAR</a>| <a href="logout">LOGOUT</a>
<h3>Welcome<%=session.getAttribute("name") %></h3>
<%
}else{
	//not loged in
%>
<a href="register.jsp">REGISTER</a> | <a href="login.jsp">LOGIN</a> 
<%
}
%>

</div>