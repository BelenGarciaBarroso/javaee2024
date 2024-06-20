package sevlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.AutenticacionService;

@WebServlet ("/Login")
public class Login extends HttpServlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pwd=request.getParameter("password");
		RequestDispatcher dispatcher;
		var service=new AutenticacionService();
		if (service.autenticar(user, pwd)) {
			// Creamos la ficha del usuario y la guardamos en un atributo de petición
			// para que la pueda recuperar la página JSP
			Ficha ficha=service.fichaUsuario(user); // creación del objeto
			request.setAttribute("ficha", ficha); // aquí se guarda el objeto
			dispatcher=request.getRequestDispatcher("bienvenida.jsp");
		}else {
			dispatcher=request.getRequestDispatcher("error.jsp");
			
		}
		dispatcher.forward(request, response);
		
		
		
	}

}
