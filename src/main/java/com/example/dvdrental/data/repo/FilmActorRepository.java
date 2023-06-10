package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.FilmActor;
import com.example.dvdrental.data.model.FilmActorId;
import org.springframework.data.repository.CrudRepository;

public interface FilmActorRepository extends CrudRepository<FilmActor, FilmActorId> {
}