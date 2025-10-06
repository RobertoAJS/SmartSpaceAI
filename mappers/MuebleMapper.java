package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.MuebleDTO;
import pe.edu.smartspace.entities.Mueble;

public class MuebleMapper {

    public static MuebleDTO toDTO(Mueble mueble) {

        if (mueble == null) return null;
        MuebleDTO dto = new MuebleDTO();

        dto.setId(mueble.getId());
        dto.setNombre(mueble.getNombre());
        dto.setCategoria(mueble.getCategoria());
        dto.setDimension(mueble.getDimension());
        dto.setEstilo(mueble.getEstilo());
        dto.setPrecio(mueble.getPrecio());
        dto.setSostenibilidad(mueble.getSostenibilidad());
        dto.setProveedor(mueble.getProveedor());
        return dto;
    }

    public static Mueble toEntity(MuebleDTO dto) {

        if (dto == null) return null;
        Mueble mueble = new Mueble();

        mueble.setId(dto.getId());
        mueble.setNombre(dto.getNombre());
        mueble.setCategoria(dto.getCategoria());
        mueble.setDimension(dto.getDimension());
        mueble.setEstilo(dto.getEstilo());
        mueble.setPrecio(dto.getPrecio());
        mueble.setSostenibilidad(dto.getSostenibilidad());
        mueble.setProveedor(dto.getProveedor());
        return mueble;
    }
}

