package net.kickstart.jff.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//2. provides the overall configuration for the application
@Configuration
@ComponentScan( { "net.kickstart.jff.*" } )
@Import( { MvcConfig.class } )
public class ApplicationConfig {

}
