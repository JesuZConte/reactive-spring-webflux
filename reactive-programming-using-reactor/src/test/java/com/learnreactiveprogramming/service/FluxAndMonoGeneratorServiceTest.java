package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;


class FluxAndMonoGeneratorServiceTest {

    FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();

    @Test
    void namesFlux() {
        var namesFlux = fluxAndMonoGeneratorService.namesFlux();

        StepVerifier.create(namesFlux)
                //.expectNext("Alex", "Ben", "Chloe")
                //.expectNextCount(3)
                .expectNext("Alex")
                .expectNextCount(2)
                .verifyComplete();
    }


    @Test
    void namesFlux_map() {

        var namesFlux = fluxAndMonoGeneratorService.namesFlux_map();

        StepVerifier.create(namesFlux)
                .expectNext("ALEX", "BEN", "CHLOE")
                .verifyComplete();

    }
}