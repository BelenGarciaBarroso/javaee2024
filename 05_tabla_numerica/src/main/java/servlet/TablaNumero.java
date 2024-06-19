package servlet;

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
			out.println("<html><head></head><body><center>");
			out.println("<table border='1'>");
//			for (int i=1;i<=Integer.parseInt(request.getParameter("numero"));i++) {
//				out.println("<td>"+i*Integer.parseInt(request.getParameter("numero"))+"</td>");
//			}
			for (int a=1;a<=10;a++) {
				out.println("<tr>");
				out.println("<td>"+a+" x "+Integer.parseInt(request.getParameter("numero"))+"=</td>");
				out.println("<td>"+a*Integer.parseInt(request.getParameter("numero"))+"</td>");
				out.println("</tr>");
			}
			
			
			out.println("</table></center>");
			out.println("<br>");
			out.println("<a href='numero.html'>Volver</a></body></html>");
		}
	}

}
