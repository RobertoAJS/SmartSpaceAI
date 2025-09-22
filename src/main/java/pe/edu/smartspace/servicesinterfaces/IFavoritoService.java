package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.Favorito;

import java.util.List;

public interface IFavoritoService {
    Favorito registrarFavorito(Long idUsuario, Long idMueble);
    List<Favorito> listarFavoritos();
    Favorito buscarPorId(Long idUsuario, Long idMueble);
}
