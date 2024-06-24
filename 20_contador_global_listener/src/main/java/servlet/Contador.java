package servlet;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet ("/Contador")
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recuperamos el atributo de sesión que continene el parámetro contador,
		// se incrementa y se vuelve a guardar. Después transferimos petición
		// a la página resultado.jsp
		int cont=1;
		int global=1;
		HttpSession s=request.getSession();
		ServletContext context=request.getServletContext();
		// contador personal
		cont=(Integer)s.getAttribute("cont");
		cont++;
		// contador global
		global=(Integer)context.getAttribute("global");
		global++;
		
		
		s.setAttribute("cont", cont); // actualiza el atributo de sesión contador
		context.setAttribute("global",global);
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
		
		
	}

}
