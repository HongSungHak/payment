package com.example.demo.customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class CustomerService {
    private final CustomerRepository repository;

    @Transactional
    public void join(Customer customer) {
        Customer registry = Customer.of(customer.getName(), customer.getPhoneNumber());
        repository.save(registry);
    }
}
