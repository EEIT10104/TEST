package eeit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("eeit")//告訴Spring 要掃苗哪個套件下的class
public class WebAppConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = 
				new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	@Override
	// 應用系統必須透過ResourceHandlerRegistry的輔助，以便處理靜態檔案：
	// 只要請求路徑是以/css/開頭的任何請求，都轉到/WEB-INF/views/css/去尋找
	// 只要請求路徑是以/image/開頭的任何請求，都轉到/WEB-INF/views/images/去尋找
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**")
				.addResourceLocations("/WEB-INF/views/css/");
		registry.addResourceHandler("/images/**")
				.addResourceLocations("/WEB-INF/views/images/");
		registry.addResourceHandler("/js/**")
		.addResourceLocations("/WEB-INF/views/js/");
		registry.addResourceHandler("/demo-images/**")
		.addResourceLocations("/WEB-INF/views/demo-images/");
		registry.addResourceHandler("/fonts/**")
		.addResourceLocations("/WEB-INF/views/fonts/");
	}
	
}
