package com.endva.internship.springbootapp.demoboot.web;

import com.endva.internship.springbootapp.demoboot.web.customers.CustomerController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackageClasses = CustomerController.class)
@Slf4j
public class ExceptionController {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<?> handleError(HttpServletRequest req, Throwable throwable) {
        log.error("Error happened", throwable);
        return ResponseEntity.status(500).body("{'error':'500'}");
    }
}
