package com.registration.example.registration.repository;

import com.registration.example.registration.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
