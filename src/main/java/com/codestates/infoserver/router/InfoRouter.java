package com.codestates.infoserver.router;

import com.codestates.infoserver.Handler.InfoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class InfoRouter {

    @Bean
    public RouterFunction<ServerResponse> router(InfoHandler infoHandler) {
        return RouterFunctions.route()
                .GET("/job", infoHandler::jobHanldler)
                .build();
    }
}
