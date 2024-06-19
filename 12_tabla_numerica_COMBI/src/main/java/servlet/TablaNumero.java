package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/TablaNumero")
public class TablaNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out=response.getWriter()){
			RequestDispatcher dispatcher;
			if (Integer.parseInt(request.getParameter("numero").in)) {
				dispatcher=request.getRequestDispatcher("error.jps");
			}else {
				dispatcher=request.getRequestDispatcher("tabla.jps");
			}
			 	
			
			out.println("<br>");
			out.println("<a href='numero.html'>Volver</a>");
		}
	}

}
