package com.endva.internship.springbootapp.demoboot.web.customers;

import com.endva.internship.springbootapp.demoboot.domain.customer.CustomerDto;
import com.endva.internship.springbootapp.demoboot.domain.customer.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<?> customers() {
        List<CustomerDto> allCustomers = customerService.listCustomers();
        if (log.isDebugEnabled()) {
            log.debug("all customers\n{}", allCustomers);
        }
        return ResponseEntity.ok(allCustomers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable(value = "id") String customerId) {
        if (true) {
            throw new RuntimeException("no customer found");
        }
        return null;
    }
}
