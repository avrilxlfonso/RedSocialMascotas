package com.pawzy.model;



@Entity
public class Usuario {
  @Id
  private Long id;
  private String nombre;
  private String email;
  private String password;

  @OneToMany(mappedBy = "usuario")
  private List<Mascota> mascotas;

  // Getters y Setters
}
