package pe.edu.smartspace.mappers;

import org.springframework.stereotype.Component;
import pe.edu.smartspace.dtos.ComentarioDTO;
import pe.edu.smartspace.entities.Comentario;
import pe.edu.smartspace.entities.Diseno;
import pe.edu.smartspace.entities.Usuario;

@Component
public class ComentarioMapper {

    public ComentarioDTO toDTO(Comentario entity) {
        ComentarioDTO dto = new ComentarioDTO();
        dto.setIdComentario(entity.getIdComentario());
        dto.setIdDiseno(entity.getDiseno().getId());
        dto.setIdUsuario(entity.getUsuario().getId());
        dto.setTextoComentario(entity.getTextoComentario());
        dto.setFecha(entity.getFecha());
        return dto;
    }

    public Comentario toEntity(ComentarioDTO dto, Diseno diseno, Usuario usuario) {
        Comentario entity = new Comentario();
        entity.setIdComentario(dto.getIdComentario());
        entity.setDiseno(diseno);
        entity.setUsuario(usuario);
        entity.setTextoComentario(dto.getTextoComentario());
        entity.setFecha(dto.getFecha());
        return entity;
    }
}
