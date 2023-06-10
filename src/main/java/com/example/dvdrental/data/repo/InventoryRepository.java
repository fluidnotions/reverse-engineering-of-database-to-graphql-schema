package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Integer> {
}