package sevlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.AutenticacionService;

@WebServlet ("/inicio")
public class inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie todas[]=request.getCookies();
		var service=new AutenticacionService();
		if(todas!=null){
		 	for(Cookie ck:todas){
		 		if(ck.getName().equals("user")){
		 			String user=ck.getValue();
		 			Ficha ficha=service.fichaUsuario(user); 
					request.setAttribute("ficha", ficha);
		 			request.getRequestDispatcher("bienvenida.jsp").forward(request, response);
		 		}
		 	}
		}
		request.getRequestDispatcher("login.html").forward(request, response);
	}
}
