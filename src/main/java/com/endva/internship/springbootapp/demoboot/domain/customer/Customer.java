package com.endva.internship.springbootapp.demoboot.domain.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "name")
    private String name;
}
