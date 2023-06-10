package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Integer> {
}