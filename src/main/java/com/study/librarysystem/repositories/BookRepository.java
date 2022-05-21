package com.study.librarysystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.librarysystem.entities.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
