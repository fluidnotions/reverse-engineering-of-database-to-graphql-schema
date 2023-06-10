package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<Rental, Integer> {
}