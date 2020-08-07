package com.example.feign.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class Rap2FeignConfig {

    @Bean
    public Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }

    @Bean
    public Request.Options options() {
        //return new Request.Options(5000,5000);
        return new Request.Options(5, TimeUnit.SECONDS,5, TimeUnit.SECONDS,true);
    }
}
