package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}