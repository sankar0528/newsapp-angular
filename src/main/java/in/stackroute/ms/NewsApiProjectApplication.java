package in.stackroute.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class NewsApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsApiProjectApplication.class, args);
	}
	
	 @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return (WebMvcConfigurer) new WebMvcConfigurerAdapter() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**").allowedOrigins("*");
	            }
	        };
	 }

}
