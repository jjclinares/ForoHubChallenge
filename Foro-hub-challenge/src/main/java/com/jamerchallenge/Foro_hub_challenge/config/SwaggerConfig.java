package com.jamerchallenge.Foro_hub_challenge.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Foro Hub Challenge API")
                .version("1.0")
                .description("API para gestionar tópicos en Foro Hub Challenge"));
    }
}

