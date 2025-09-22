package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.IntegracionApiDTO;
import pe.edu.smartspace.entities.IntegracionApi;

public class IntegracionApiMapper {
    public static IntegracionApiDTO toDTO(IntegracionApi i) {
        if (i == null) return null;
        IntegracionApiDTO dto = new IntegracionApiDTO();
        dto.setId(i.getId());
        dto.setIdUsuario(i.getUsuario() != null ? i.getUsuario().getId() : null);
        dto.setTipoApi(i.getTipoApi());
        dto.setEstado(i.getEstado());
        dto.setFechaUso(i.getFechaUso());
        return dto;
    }

    public static IntegracionApi toEntity(IntegracionApiDTO dto) {
        if (dto == null) return null;
        IntegracionApi i = new IntegracionApi();
        i.setId(dto.getId());
        i.setTipoApi(dto.getTipoApi());
        i.setEstado(dto.getEstado());
        i.setFechaUso(dto.getFechaUso());
        return i;
    }
}
