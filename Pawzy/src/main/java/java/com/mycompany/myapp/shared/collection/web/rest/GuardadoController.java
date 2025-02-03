package java.com.mycompany.myapp.shared.collection.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.com.mycompany.myapp.shared.collection.domain.Guardado;
import java.com.mycompany.myapp.shared.collection.service.GuardadoService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/guardados")
public class GuardadoController {
  private final GuardadoService guardadoService;

  public GuardadoController(GuardadoService guardadoService) {
    this.guardadoService = guardadoService;
  }

  @GetMapping("/usuario/{usuarioId}")
  public List<Guardado> obtenerGuardados(@PathVariable Long usuarioId) {
    return guardadoService.obtenerFotosGuardadasPorUsuario(usuarioId);
  }

  @PostMapping
  public Guardado guardar(@RequestBody Guardado guardado) {
    return guardadoService.guardarFoto(guardado);
  }

  @GetMapping("/verificar")
  public ResponseEntity<Boolean> verificarGuardado(@RequestParam Long usuarioId, @RequestParam Long fotoId) {
    Optional<Guardado> guardado = guardadoService.verificarSiUsuarioGuardoFoto(usuarioId, fotoId);
    return ResponseEntity.ok(guardado.isPresent());
  }
}

