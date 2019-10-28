package com.endva.internship.springbootapp.demoboot;

import com.endva.internship.springbootapp.demoboot.domain.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
        "com.endva.internship.springbootapp.demoboot.application.config",
        "com.endva.internship.springbootapp.demoboot.domain.customer",
        "com.endva.internship.springbootapp.demoboot.web",
    }
)
public class DemobootApplication {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemobootApplication.class, args);
    }

}
