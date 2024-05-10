package com.hvdbs.codewars;

import com.hvdbs.savra.statsgenerator.StatisticsGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@RequiredArgsConstructor
@SpringBootApplication
public class Main {
    private final StatisticsGenerator statisticsGenerator;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void startup() {
        statisticsGenerator.generate();
    }
}
