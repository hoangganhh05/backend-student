package com.example.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Cho phép tất cả đường dẫn
                .allowedOrigins("http://localhost:3001") // Cho React
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Các method được phép
                .allowedHeaders("*");
    }
}
