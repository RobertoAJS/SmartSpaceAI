package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.ComentarioDTO;
import pe.edu.smartspace.entities.Comentario;

public class ComentarioMapper {
    public static ComentarioDTO toDTO(Comentario c) {
        if (c == null) return null;
        ComentarioDTO dto = new ComentarioDTO();
        dto.setId(c.getId());
        dto.setIdDiseno(c.getDiseno() != null ? c.getDiseno().getId() : null);
        dto.setIdUsuario(c.getUsuario() != null ? c.getUsuario().getId() : null);
        dto.setTextoComentario(c.getTextoComentario());
        dto.setFecha(c.getFecha());
        return dto;
    }

    public static Comentario toEntity(ComentarioDTO dto) {
        if (dto == null) return null;
        Comentario c = new Comentario();
        c.setId(dto.getId());
        c.setTextoComentario(dto.getTextoComentario());
        c.setFecha(dto.getFecha());
        return c;
    }
}
