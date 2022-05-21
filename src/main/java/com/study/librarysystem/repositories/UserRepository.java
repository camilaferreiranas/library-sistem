package com.study.librarysystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.librarysystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
