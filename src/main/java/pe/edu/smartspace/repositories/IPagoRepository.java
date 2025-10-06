package pe.edu.smartspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.smartspace.dtos.UsuarioGastoDTO;
import pe.edu.smartspace.entities.Pago;

import java.util.List;

public interface IPagoRepository extends JpaRepository<Pago, Long> {

    @Query("SELECT new pe.edu.smartspace.dtos.UsuarioGastoDTO(u.nombre, SUM(p.monto)) " +
            "FROM Pago p JOIN p.usuario u " +
            "GROUP BY u.nombre ORDER BY SUM(p.monto) DESC")
    List<UsuarioGastoDTO> findUsuariosConMayorGasto();
}
