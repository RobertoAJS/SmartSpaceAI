package pe.edu.smartspace.mappers;

import org.springframework.stereotype.Component;
import pe.edu.smartspace.dtos.VersionDisenoDTO;
import pe.edu.smartspace.entities.Diseno;
import pe.edu.smartspace.entities.VersionDiseno;

@Component
public class VersionDisenoMapper {

    public VersionDisenoDTO toDTO(VersionDiseno entity) {
        if (entity == null) return null;

        VersionDisenoDTO dto = new VersionDisenoDTO();
        dto.setIdVersion(entity.getIdVersion());
        dto.setIdDiseno(entity.getDiseno() != null ? entity.getDiseno().getId() : null);
        dto.setFecha(entity.getFecha());
        dto.setArchivoModelo(entity.getArchivoModelo());
        dto.setComentarios(entity.getComentarios());
        return dto;
    }

    public VersionDiseno toEntity(VersionDisenoDTO dto, Diseno diseno) {
        if (dto == null) return null;

        VersionDiseno entity = new VersionDiseno();
        entity.setIdVersion(dto.getIdVersion());
        entity.setDiseno(diseno);
        entity.setFecha(dto.getFecha());
        entity.setArchivoModelo(dto.getArchivoModelo());
        entity.setComentarios(dto.getComentarios());
        return entity;
    }
}
