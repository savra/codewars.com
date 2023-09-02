package com.hvdbs.codewars;

import com.hvdbs.codewars.statgenerator.StatsGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        StatsGenerator.generate();
    }
}
