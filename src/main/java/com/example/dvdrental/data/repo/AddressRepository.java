package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}