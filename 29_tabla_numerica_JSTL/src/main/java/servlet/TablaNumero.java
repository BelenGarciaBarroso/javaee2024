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
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try (PrintWriter out=response.getWriter()){
		
			try {
				
				Integer.parseInt(request.getParameter("numero"));
				request.getRequestDispatcher("tabla.jsp").forward(request, response);
				
			} catch (NumberFormatException e ) {
				request.getRequestDispatcher("error.jsp").forward(request, response);
	        } catch (NullPointerException e) {
	        	request.getRequestDispatcher("error.jsp").forward(request, response);
	        			
	        }
			 	
			
			out.println("<br>");
			out.println("<a href='numero.html'>Volver</a>");
		}
	}

}
