<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, model.Producto"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% List<Producto> productos=(List<Producto>)session.getAttribute("carrito"); %>
	<center>
		<h1> Listado del carrito</h1>
		<br>
		<table border=1>
			<th>Nombre</th><th>Precio</th><th>Categoria</th>
			<%for (Producto p:productos) {%><tr>
					<td><%=p.getNombre() %></td>
					<td><%=p.getPrecio() %></td>
					<td><%=p.getCategoria() %></td>
					<td><a href="Eliminar?nombre=<%=p.getNombre()%>">Eliminar</a></td>
				</tr>
			<%} %>
		</table>
		
		<br>
		<a href="menu.html">VOLVER</a>
	
	</center>

</body>
</html>