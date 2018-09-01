package com.joden.microservice.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joden.microservice.study.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
