package filtro;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class FiltroLogin extends HttpFilter implements Filter {

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// recuperamos le atributo de sesión: usuario
		//Casteanis a -strint y HttpServletRequest para llamar al getsession para recuperar el atributo
		String usuario=(String)((HttpServletRequest)request).getSession().getAttribute("usuario");
		String param=request.getParameter("operation");
		// Si el atributo de sesión existe o el parámetro es diferente nulo y es igual a doLogin,
		// el usuario se autenticó y le dejamos pasar
		if (usuario!=null||param!=null&&param.equals("doLogin")) {
			chain.doFilter(request, response); // significa siguiente.
		}else {
			// si lo que puiere es hacer login, hay que dejarle pasar. 
			request.getRequestDispatcher("login.html").forward(request, response);
		}
			
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
