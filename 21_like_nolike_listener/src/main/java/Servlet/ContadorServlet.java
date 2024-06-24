package Servlet;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet ("/ContadorServlet")
public class ContadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cont=0;
		String nombre=request.getParameter("opcion");
		ServletContext context=request.getServletContext();
		cont=(int)context.getAttribute(nombre);
		cont++;		
		context.setAttribute(nombre, cont);
		request.getRequestDispatcher("contador.jsp").forward(request, response);
	}

}
