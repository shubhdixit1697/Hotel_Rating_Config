package com.app.UserService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.UserService.Entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
