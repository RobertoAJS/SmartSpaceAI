package pe.edu.smartspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.smartspace.dtos.CategoriaPromedioDTO;
import pe.edu.smartspace.dtos.MueblePromDTO;
import pe.edu.smartspace.entities.Mueble;

import java.util.List;

public interface IMuebleRepository extends JpaRepository<Mueble, Long> {

    @Query("SELECT new pe.edu.smartspace.dtos.MueblePromDTO(m.proveedor, AVG(m.precio)) " +
            "FROM Mueble m GROUP BY m.proveedor ORDER BY AVG(m.precio) DESC")
    List<MueblePromDTO> obtenerPromedioPrecioPorProveedor();

    @Query("SELECT new pe.edu.smartspace.dtos.CategoriaPromedioDTO(m.categoria, AVG(m.precio)) " +
            "FROM Mueble m GROUP BY m.categoria ORDER BY AVG(m.precio) DESC")
    List<CategoriaPromedioDTO> obtenerPromedioPrecioPorCategoria();
}
