package pe.edu.smartspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.smartspace.dtos.DisenoComentadoDTO;
import pe.edu.smartspace.entities.Comentario;

import java.util.List;

public interface IComentarioRepository extends JpaRepository<Comentario, Long> {

    @Query("SELECT new pe.edu.smartspace.dtos.DisenoComentadoDTO(d.nombre, COUNT(c.idComentario)) " +
            "FROM Comentario c JOIN c.diseno d " +
            "GROUP BY d.nombre ORDER BY COUNT(c.idComentario) DESC")
    List<DisenoComentadoDTO> findDisenosMasComentados();
}
