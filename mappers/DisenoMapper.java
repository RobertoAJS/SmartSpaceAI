package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.DisenoDTO;
import pe.edu.smartspace.entities.Diseno;

public class DisenoMapper {

    public static DisenoDTO toDTO(Diseno diseno) {

        if (diseno == null) return null;
        DisenoDTO dto = new DisenoDTO();

        dto.setId(diseno.getId());
        dto.setNombre(diseno.getNombre());
        dto.setFechaCreacion(diseno.getFechaCreacion());
        dto.setEstado(diseno.getEstado());
        dto.setIdUsuario(diseno.getUsuario() != null ? diseno.getUsuario().getId() : null);
        return dto;
    }

    public static Diseno toEntity(DisenoDTO dto) {

        if (dto == null) return null;
        Diseno diseno = new Diseno();

        diseno.setId(dto.getId());
        diseno.setNombre(dto.getNombre());
        diseno.setFechaCreacion(dto.getFechaCreacion());
        diseno.setEstado(dto.getEstado());
        return diseno;
    }
}

