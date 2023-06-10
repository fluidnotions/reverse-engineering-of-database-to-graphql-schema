package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Integer> {
}