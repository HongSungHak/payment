package com.example.demo.customer;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Grade grade;

    private Customer(String name, String phoneNumber, Grade grade) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
    }

    public static Customer of (String name, String phoneNumber) {
        return new Customer(name, phoneNumber, Grade.BRONZE);
    }
}
