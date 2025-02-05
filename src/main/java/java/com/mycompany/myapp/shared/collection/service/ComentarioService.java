package java.com.mycompany.myapp.shared.collection.service;

import org.springframework.stereotype.Service;

import java.com.mycompany.myapp.shared.collection.domain.Comentario;
import java.com.mycompany.myapp.shared.collection.repository.ComentarioRepository;
import java.util.List;

@Service
public class ComentarioService {
  private final ComentarioRepository comentarioRepository;

  public ComentarioService(ComentarioRepository comentarioRepository) {
    this.comentarioRepository = comentarioRepository;
  }

  public List<Comentario> obtenerComentariosPorFoto(Long fotoId) {
    return comentarioRepository.findByFotoId(fotoId);
  }

  public Comentario agregarComentario(Comentario comentario) {
    return comentarioRepository.save(comentario);
  }
}
