package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.Comentario;
import java.util.List;

public interface IComentarioService {
    Comentario registrarComentario(Comentario comentario, Long idDiseno, Long idUsuario);
    List<Comentario> listarComentarios();
    Comentario buscarPorId(Long id);
}
