package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

@WebServlet("/BuscarResultadoAction")
public class BuscarResultadoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BuscadorService buscar=new BuscadorService();
		List<Resultado> resultado=buscar.resultadosPorTematica(request.getParameter("categoria"));
		request.setAttribute("resultado", resultado);
	}

}
