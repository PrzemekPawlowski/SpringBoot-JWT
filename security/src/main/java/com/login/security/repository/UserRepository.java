package com.login.security.repository;

import com.login.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<com.login.security.user.User, Integer> {

    Optional<User> findByEmail(String email);

}
