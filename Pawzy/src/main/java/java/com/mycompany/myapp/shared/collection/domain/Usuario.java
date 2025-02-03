package java.com.mycompany.myapp.shared.collection.domain;

// Backend: src/main/java/com/mycompany/myapp/domain/User.java

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import java.util.List;


@Entity
@Table(name = "usuarios")
public class Usuario {
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

  private String fotoPerfil;

  @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Foto> fotos;

  @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Like> likes;

  @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Comentario> comentarios;

  @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Guardado> guardados;

  // Constructor con parámetros
  public Usuario(Long id, String username, String email, String password, String fotoPerfil, List<Foto> fotos, List<Like> likes, List<Comentario> comentarios, List<Guardado> guardados) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.password = password;
    this.fotoPerfil = fotoPerfil;
    this.fotos = fotos;
    this.likes = likes;
    this.comentarios = comentarios;
    this.guardados = guardados;
  }
}



