package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.FilmCategory;
import com.example.dvdrental.data.model.FilmCategoryId;
import org.springframework.data.repository.CrudRepository;

public interface FilmCategoryRepository extends CrudRepository<FilmCategory, FilmCategoryId> {
}