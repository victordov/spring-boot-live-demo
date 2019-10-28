package com.endva.internship.springbootapp.demoboot.application.config;

import com.endva.internship.springbootapp.demoboot.domain.customer.Customer;
import com.endva.internship.springbootapp.demoboot.domain.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Configuration
// bean is created only if profile is dev
@Profile("dev")
public class DbInit {

    @Autowired
    CustomerRepository customerRepository;

    @PostConstruct
    @Transactional
    public void addDataToDb() {
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer("customer" + i);
            customerRepository.save(customer);
        }
    }
}
