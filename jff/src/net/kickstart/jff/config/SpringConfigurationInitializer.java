package net.kickstart.jff.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//1. configuration initializer class (equivalent to web.xml)
public class SpringConfigurationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// returning applicationContext.xml equivalent class
		return new Class[] { ApplicationConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// returning dispatcher-servlet.xml equivalent class
		return new Class[] { DispatcherServletConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// registering dispatcher-servlet.xml
		return new String[] { "/" };
	}

}
