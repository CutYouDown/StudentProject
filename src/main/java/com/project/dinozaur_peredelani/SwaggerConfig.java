package com.project.dinozaur_peredelani;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI api(){
        return new OpenAPI()
                .info(new Info()
                        .title("Dinozaur University API")
                        .version("1.0")
                        .description("API for managing groups and students"));
    }
}
