package com.example.controllers;

import com.example.api.AbstractDefaultController;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import reactor.core.publisher.Mono;

@Controller
public class DefaultControllerImpl extends AbstractDefaultController {

    @Override
    public Mono<HttpResponse<Void>> get() {
        return Mono.just(HttpResponse.ok());
    }

    @Override
    public Mono<HttpResponse<Void>> save() {
        return Mono.just(HttpResponse.ok());
    }
}
