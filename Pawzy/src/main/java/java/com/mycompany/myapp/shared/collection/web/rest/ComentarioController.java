package java.com.mycompany.myapp.shared.collection.web.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.com.mycompany.myapp.shared.collection.domain.Comentario;
import java.com.mycompany.myapp.shared.collection.service.ComentarioService;
import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {
  private final ComentarioService comentarioService;

  public ComentarioController(ComentarioService comentarioService) {
    this.comentarioService = comentarioService;
  }

  @GetMapping("/foto/{fotoId}")
  public List<Comentario> obtenerPorFoto(@PathVariable Long fotoId) {
    return comentarioService.obtenerComentariosPorFoto(fotoId);
  }

  @PostMapping
  public Comentario agregar(@RequestBody Comentario comentario) {
    return comentarioService.agregarComentario(comentario);
  }
}
