package com.pawzy.repository;

import com.pawzy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  // Métodos de búsqueda personalizados si es necesario
}
