package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Producto;

@WebServlet ("/AgregarCarrito")
public class AgregarCarrito extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Producto> producto= new ArrayList<>();
		HttpSession sesion=request.getSession();
		if(sesion.getAttribute("carrito")!=null) {
			producto=(List<Producto>)sesion.getAttribute("carrito");	
		}
		producto.add(new Producto(request.getParameter("nombre"),
				Double.parseDouble(request.getParameter("precio")),
				request.getParameter("categoria")));
		
		sesion.setAttribute("carrito", producto);		
		request.getRequestDispatcher("menu.html").forward(request, response);
	
	}

}
