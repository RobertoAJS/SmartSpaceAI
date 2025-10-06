package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.dtos.CategoriaPopularDTO;
import pe.edu.smartspace.entities.Favorito;
import java.util.List;

public interface IFavoritoService {
    Favorito registrarFavorito(Favorito favorito);
    List<Favorito> listarFavoritos();
    Favorito buscarPorId(Long id);
    void eliminarFavorito(Long id);
    List<CategoriaPopularDTO> obtenerCategoriasMasPopulares();
}

