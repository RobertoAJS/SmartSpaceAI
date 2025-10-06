package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.FavoritoDTO;
import pe.edu.smartspace.entities.Favorito;
import pe.edu.smartspace.entities.Mueble;
import pe.edu.smartspace.entities.Usuario;

public class FavoritoMapper {

    public static FavoritoDTO toDTO(Favorito favorito) {
        FavoritoDTO dto = new FavoritoDTO();
        dto.setId(favorito.getId());
        dto.setUsuarioId(favorito.getUsuario().getId());
        dto.setMuebleId(favorito.getMueble().getId());
        dto.setFechaAgregado(favorito.getFechaAgregado());
        return dto;
    }

    public static Favorito toEntity(FavoritoDTO dto, Usuario usuario, Mueble mueble) {
        Favorito favorito = new Favorito();
        favorito.setId(dto.getId());
        favorito.setUsuario(usuario);
        favorito.setMueble(mueble);
        favorito.setFechaAgregado(dto.getFechaAgregado());
        return favorito;
    }
}
