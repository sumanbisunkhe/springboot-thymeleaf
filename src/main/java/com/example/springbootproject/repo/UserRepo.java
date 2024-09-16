package com.example.springbootproject.repo;

import com.example.springbootproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
