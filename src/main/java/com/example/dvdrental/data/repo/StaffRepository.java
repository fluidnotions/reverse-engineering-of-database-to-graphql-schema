package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
}