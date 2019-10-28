package com.endva.internship.springbootapp.demoboot.application.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ValidateDatabase {

    @Scheduled(fixedRate = 5_000)
    public void validatingDatabase() {
        log.info("validating database");
    }
}
