package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Curso;
import service.CursosService;

@WebServlet ("/NuevoAction")
public class NuevoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CursosService service=new CursosService();
		service.altaCurso(new Curso (0, request.getParameter("nombre"),
				request.getParameter("tematica"),
				Integer.parseInt(request.getParameter("duracion")),
				Double.parseDouble(request.getParameter("precio"))));
				
				
	}

}
