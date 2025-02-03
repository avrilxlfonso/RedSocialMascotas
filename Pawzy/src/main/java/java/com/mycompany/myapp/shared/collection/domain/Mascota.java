package java.com.mycompany.myapp.shared.collection.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Mascota {

  @jakarta.persistence.Id
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String nombre;

  @ManyToOne
  @JoinColumn(name = "usuario_id", nullable = false)
  private User usuario;

  @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Foto> fotos = new HashSet<Foto>();

  // Getters y Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public User getUsuario() {
    return usuario;
  }

  public void setUsuario(User usuario) {
    this.usuario = usuario;
  }

  public Set<Foto> getFotos() {
    return fotos;
  }

  public void setFotos(Set<Foto> fotos) {
    this.fotos = fotos;
  }



}

