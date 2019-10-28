package com.endva.internship.springbootapp.demoboot.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@Profile("prod")
@EnableScheduling
public class SchedulerConfig {

}
