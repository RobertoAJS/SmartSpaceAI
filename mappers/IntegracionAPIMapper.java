package pe.edu.smartspace.mappers;

import pe.edu.smartspace.entities.IntegracionAPI;
import pe.edu.smartspace.dtos.IntegracionAPIDTO;

public class IntegracionAPIMapper {

    public static IntegracionAPIDTO toDTO(IntegracionAPI entity) {
        IntegracionAPIDTO dto = new IntegracionAPIDTO();
        dto.setIdIntegracion(entity.getIdIntegracion());
        dto.setTipoServicio(entity.getTipoServicio());
        dto.setApiKey(entity.getApiKey());
        dto.setEstado(entity.getEstado());
        dto.setFechaCreacion(entity.getFechaCreacion());
        dto.setUsuarioId(entity.getUsuario().getId()); // solo referencia al id del usuario
        return dto;
    }

    public static IntegracionAPI toEntity(IntegracionAPIDTO dto) {
        IntegracionAPI entity = new IntegracionAPI();
        entity.setIdIntegracion(dto.getIdIntegracion());
        entity.setTipoServicio(dto.getTipoServicio());
        entity.setApiKey(dto.getApiKey());
        entity.setEstado(dto.getEstado());
        entity.setFechaCreacion(dto.getFechaCreacion());

        // Aquí se asume que solo seteamos la referencia del usuario con el id
        if(dto.getUsuarioId() != null) {
            pe.edu.smartspace.entities.Usuario usuario = new pe.edu.smartspace.entities.Usuario();
            usuario.setId(dto.getUsuarioId());
            entity.setUsuario(usuario);
        }

        return entity;
    }
}
