package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Store;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store, Integer> {
}