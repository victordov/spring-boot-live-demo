package com.endva.internship.springbootapp.demoboot.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
    "com.endva.internship.springbootapp.demoboot.domain.customer"
})
public class DbConfig {

}
