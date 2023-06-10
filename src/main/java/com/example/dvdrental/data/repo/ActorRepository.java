package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
}