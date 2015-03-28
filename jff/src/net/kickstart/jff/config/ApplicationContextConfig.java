package net.kickstart.jff.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.kickstart.jff", excludeFilters = @Filter(
		type=FilterType.ANNOTATION, value={ org.springframework.stereotype.Controller.class }))
@Import( { WebMvcConfig.class } )
public class ApplicationContextConfig {

	

}
