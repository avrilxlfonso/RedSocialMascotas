package com.mycompany.myapp.shared.collection.repository;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SecurityProperties.User, Long> {
  Optional<SecurityProperties.User> findByUsername(String username);
}
