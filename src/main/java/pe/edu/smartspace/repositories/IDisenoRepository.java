package pe.edu.smartspace.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.smartspace.dtos.DisenoRecienteDTO;
import pe.edu.smartspace.entities.Diseno;

import java.util.List;

public interface IDisenoRepository extends JpaRepository<Diseno, Long> {

    @Query("SELECT new pe.edu.smartspace.dtos.DisenoRecienteDTO(d.nombre, d.fechaCreacion) " +
            "FROM Diseno d ORDER BY d.fechaCreacion DESC")
    List<DisenoRecienteDTO> obtenerDisenoMasReciente(Pageable pageable);
}
