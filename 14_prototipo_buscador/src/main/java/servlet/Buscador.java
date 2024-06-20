package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.ResultadoService;


public class Buscador extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tematica=request.getParameter("categoria");
		var service=new ResultadoService();
		if(service.comprobar(tematica)) {
			Resultado resultado=(Resultado) service.resultado(tematica);
			request.setAttribute("resultado", resultado);
			request.getRequestDispatcher("informacion.jsp").forward(request, response);;
		}else {
			request.getRequestDispatcher("error.jsp").forward(request, response);;
		}
	}

}
