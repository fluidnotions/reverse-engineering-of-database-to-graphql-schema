package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}