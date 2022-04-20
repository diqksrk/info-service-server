package com.codestates.infoserver.Handler;

import com.codestates.infoserver.model.ResponseJob;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class InfoHandler {

    public Mono<ServerResponse> jobHanldler(ServerRequest serverRequest) {
        String name = serverRequest.queryParam("name").orElse("");

        return ServerResponse
                .ok()
                .bodyValue(new ResponseJob());
    }
}
