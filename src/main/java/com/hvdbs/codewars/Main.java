package com.hvdbs.codewars;

import com.hvdbs.codewars.service.UserService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Main {
    private final WebClient webClient;
    private final UserService userService;

    public Main(WebClient webClient, UserService userService) {
        this.webClient = webClient;
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);


    }
}
