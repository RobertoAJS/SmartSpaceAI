package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.dtos.ComentarioDTO;

import java.util.List;

public interface IComentarioService {

    ComentarioDTO registrarComentario(ComentarioDTO comentarioDTO);

    List<ComentarioDTO> listarComentarios();

    ComentarioDTO buscarPorId(Long id);

    void eliminar(Long id);
}
