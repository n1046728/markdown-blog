package com.swj.mdblog.repositories;

import com.swj.mdblog.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}