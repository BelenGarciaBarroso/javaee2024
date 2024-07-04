package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("operation");
		String urlView="";
		switch(op) {
			case "doBuscar":
				request.getRequestDispatcher("BuscarController").forward(request, response);
				return;
			
			case "doEliminar":
				request.getRequestDispatcher("EliminarController").include(request, response);
				urlView= "eliminar.jsp";
				break;
			
			case "doGuardar":
				request.getRequestDispatcher("GuardarController").include(request, response);
				urlView= "nuevo.jsp";
				break;
			
			case "doLogin":
				request.getRequestDispatcher("LoginController").include(request, response);
				
				urlView= (Boolean)request.getAttribute("autenticado")?"menu.html":"error.jsp";
				break;
			
			case "doModificar":
				request.getRequestDispatcher("ModificarController").include(request, response);
				urlView= "modificar.jsp";
				break;
				
			case "toNuevo":urlView="nuevo.jsp";break;
				
			case "toEliminar":urlView="eliminar.jsp";;break;
			
			case "toBuscar":urlView="buscar.html";break;
			case "toMenu":urlView="menu.html";break;

			case "toModificar":urlView="modificar.jsp";break;
			default:urlView="login.html";break;
		};
		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
