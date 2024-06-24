package listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class EscuchadorEventos implements ServletContextListener, HttpSessionListener {

	
   
    public void sessionCreated(HttpSessionEvent se)  { 
        HttpSession sesion=se.getSession();
        sesion.setAttribute("cont", 0);
        
        
	}
	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext context=sce.getServletContext();
        context.setAttribute("global", 0);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
	
}
