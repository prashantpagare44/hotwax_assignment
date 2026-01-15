package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data 
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String firstName;
    private String lastName;
}