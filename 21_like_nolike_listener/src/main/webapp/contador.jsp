<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<img src="himalaya.jpg" width="200" height="100" >
		<br>
		<br>
		<h1> <a href="ContadorServlet?opcion=like"> <img src="megusta.png" width= ></a>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ContadorServlet?opcion=noLike"> <img src="NOmegusta.png"></a></h1>
		<br>
			<h1><%=application.getAttribute("like") %>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<%=application.getAttribute("noLike") %></h1>
		
	
	</center>


</body>
</html>