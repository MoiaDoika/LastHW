package config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI();

    }
}