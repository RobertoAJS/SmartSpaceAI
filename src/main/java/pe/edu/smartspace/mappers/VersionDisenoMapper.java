package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.VersionDisenoDTO;
import pe.edu.smartspace.entities.VersionDiseno;

public class VersionDisenoMapper {

    public static VersionDisenoDTO toDTO(VersionDiseno v) {
        if (v == null) return null;
        VersionDisenoDTO dto = new VersionDisenoDTO();
        dto.setId(v.getId());
        dto.setIdDiseno(v.getDiseno() != null ? v.getDiseno().getId() : null);
        dto.setFecha(v.getFecha());
        dto.setArchivoModelo(v.getArchivoModelo());
        dto.setCambios(v.getCambios());
        return dto;
    }

    public static VersionDiseno toEntity(VersionDisenoDTO dto) {
        if (dto == null) return null;
        VersionDiseno v = new VersionDiseno();
        v.setId(dto.getId());
        v.setFecha(dto.getFecha());
        v.setArchivoModelo(dto.getArchivoModelo());
        v.setCambios(dto.getCambios());
        return v;
    }
}
