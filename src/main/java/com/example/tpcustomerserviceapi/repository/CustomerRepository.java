package com.example.tpcustomerserviceapi.repository;

import ma.amarghad.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
