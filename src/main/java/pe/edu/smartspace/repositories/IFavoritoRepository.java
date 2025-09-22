package pe.edu.smartspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.smartspace.entities.Favorito;
import pe.edu.smartspace.entities.FavoritoId;

public interface IFavoritoRepository extends JpaRepository<Favorito, FavoritoId> {
}
