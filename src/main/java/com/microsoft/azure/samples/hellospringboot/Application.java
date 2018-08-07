package com.microsoft.azure.samples.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class Application {

    @Bean
    HealthIndicator health() {
        return () -> Health.status("I <3 Production!").build();
    }

    @Bean
    RouterFunction<ServerResponse> routes() {
        return route(GET("/api/hello"), request -> ok().syncBody("Hello, Azure!"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
