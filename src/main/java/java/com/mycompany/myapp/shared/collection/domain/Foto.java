package java.com.mycompany.myapp.shared.collection.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "fotos")
class Foto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String url;

  @ManyToOne
  @JoinColumn(name = "usuario_id")
  private Usuario usuario;

  // Constructor vacío
  public Foto() {
  }

  // Constructor con parámetros
  public Foto(Long id, String url, Usuario usuario) {
    this.id = id;
    this.url = url;
    this.usuario = usuario;
  }

  // Getters y setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}


