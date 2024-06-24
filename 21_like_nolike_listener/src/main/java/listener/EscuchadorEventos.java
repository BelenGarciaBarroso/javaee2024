package listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class EscuchadorEventos implements ServletContextListener {

   
    public void contextInitialized(ServletContextEvent sce)  { 
         ServletContext context=sce.getServletContext();
         context.setAttribute("like", 0);
         context.setAttribute("noLike", 0);
         
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
	
}
