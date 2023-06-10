package com.example.dvdrental.data.repo;

import com.example.dvdrental.data.model.Language;
import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, Integer> {
}