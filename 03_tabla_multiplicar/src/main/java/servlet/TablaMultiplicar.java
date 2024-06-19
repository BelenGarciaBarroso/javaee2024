package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TablaMultiplicar")
public class TablaMultiplicar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out=response.getWriter()){
			out.println("<html><head></head><body><center>");
			//out.println("<h2>TALBA DEL 1 AL 10</h2>");
			out.println("<table border='1'>");
			for (int i=1; i<=10;i++) {
				out.println("<tr>");
				for (int a=1;a<=10;a++) {
					out.println("<td>"+i*a+"</td>");
				}
				out.println("</tr>");
				
			}
			out.println("</table></centre></body></html>");
			
		}
	}

}
