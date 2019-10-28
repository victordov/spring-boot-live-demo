package com.endva.internship.springbootapp.demoboot.domain.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerDto> listCustomers() {
        return convertCustomers(customerRepository.findAll());
    }

    private List<CustomerDto> convertCustomers(List<Customer> all) {
        return all.stream()
            .map(cust -> new CustomerDto(cust.getName()))
            .collect(Collectors.toList());
    }
}
