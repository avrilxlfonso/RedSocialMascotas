package com.mycompany.myapp.shared.collection.domain;

// Backend: src/main/java/com/mycompany/myapp/domain/User.java


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;

import java.util.HashSet;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Column(unique = true)
  private String username;

  @NotNull
  @Email
  @Column(unique = true)
  private String email;

  @NotNull
  private String password;

  @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Mascota> mascotas = new HashSet<>();

  // Getters y Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Mascota> getMascotas() {
    return mascotas;
  }

  public void setMascotas(Set<Mascota> mascotas) {
    this.mascotas = mascotas;
  }
}
