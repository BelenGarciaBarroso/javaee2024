package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/FrontController")
public class FrontController extends HttpServlet {
		
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("operation");
		String urlView="";
		switch(operation) {
		case "doTemas":
			request.getRequestDispatcher("TemasController").include(request, response);
			urlView="mostrarTemas.jsp";
			break;
		
		case "doLibros":
			request.getRequestDispatcher("LibrosController").forward(request, response);
			return;
			
		default:
			urlView="inicio.htm"; break;
		}
		
		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
