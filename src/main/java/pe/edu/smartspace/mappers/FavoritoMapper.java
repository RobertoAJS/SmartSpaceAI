package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.FavoritoDTO;
import pe.edu.smartspace.entities.Favorito;

public class FavoritoMapper {
    public static FavoritoDTO toDTO(Favorito f) {
        if (f == null) return null;
        FavoritoDTO dto = new FavoritoDTO();
        dto.setIdUsuario(f.getUsuario() != null ? f.getUsuario().getId() : null);
        dto.setIdMueble(f.getMueble() != null ? f.getMueble().getId() : null);
        return dto;
    }
}
