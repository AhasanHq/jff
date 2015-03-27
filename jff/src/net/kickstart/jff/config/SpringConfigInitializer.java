package net.kickstart.jff.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//1. configuration initializer class (equivalent to web.xml)
/*
 * The SpringConfigInitializer class is bootstrapped automatically 
 * by any Servlet 3.0-compliant container (e.g. Apache Tomcat 7), 
 * and it will look for an implementation of the WebApplicationInitializer interface 
 * and invoke its onStartup() method.
 */
public class SpringConfigInitializer implements WebApplicationInitializer{	

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		// registering applicationContext
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(ApplicationContextConfig.class);
		
		// registering and defining dispatcher servlet
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");	
						
	}

}
