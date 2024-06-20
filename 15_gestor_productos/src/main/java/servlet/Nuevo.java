package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductoService;

public class Nuevo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		var service=new ProductoService();
		String nombre=request.getParameter("nombre");
		double precio=Double.parseDouble(request.getParameter("precio"));
		String categoria=request.getParameter("categoria");
		Producto producto=new Producto (nombre,precio,categoria);
		if(service.grabar(producto)) {
			request.getRequestDispatcher("mensajeSi.jsp");
		}else {
			request.getRequestDispatcher("mensajeNo.jsp");
		};
		
	}

}
