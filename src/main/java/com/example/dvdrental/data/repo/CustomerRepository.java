package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}