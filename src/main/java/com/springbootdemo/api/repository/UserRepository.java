package com.springbootdemo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdemo.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
