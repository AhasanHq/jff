package net.kickstart.jff.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//3. enables Spring MVC and configures the relevant beans
@EnableWebMvc
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		super.configureDefaultServletHandling(configurer);
		// enable configurer
		configurer.enable();
	}		
	
}
