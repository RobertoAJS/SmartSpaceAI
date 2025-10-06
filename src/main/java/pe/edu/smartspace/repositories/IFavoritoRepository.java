package pe.edu.smartspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.smartspace.dtos.CategoriaPopularDTO;
import pe.edu.smartspace.entities.Favorito;

import java.util.List;

public interface IFavoritoRepository extends JpaRepository<Favorito, Long> {

    @Query("SELECT new pe.edu.smartspace.dtos.CategoriaPopularDTO(m.categoria, COUNT(f.id)) " +
            "FROM Favorito f JOIN f.mueble m " +
            "GROUP BY m.categoria ORDER BY COUNT(f.id) DESC")
    List<CategoriaPopularDTO> findCategoriasMasPopulares();
}
