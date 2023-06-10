package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}