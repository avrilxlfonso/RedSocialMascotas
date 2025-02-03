package java.com.mycompany.myapp.shared.collection.web.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.com.mycompany.myapp.shared.collection.domain.Usuario;
import java.com.mycompany.myapp.shared.collection.service.UsuarioService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping
  public List<Usuario> obtenerTodos() {
    return usuarioService.obtenerTodosLosUsuarios();
  }

  @GetMapping("/{email}")
  public ResponseEntity<Usuario> obtenerPorEmail(@PathVariable String email) {
    Optional<Usuario> usuario = usuarioService.obtenerUsuarioPorEmail(email);
    return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping
  public Usuario registrar(@RequestBody Usuario usuario) {
    return usuarioService.registrarUsuario(usuario);
  }
}

