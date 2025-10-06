package pe.edu.smartspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.smartspace.dtos.UsuarioDisenosDTO;
import pe.edu.smartspace.entities.Usuario;

import java.util.List;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findOneByUsername(String username);

    @Query("SELECT new pe.edu.smartspace.dtos.UsuarioDisenosDTO(u.nombre, COUNT(d.id)) " +
            "FROM Usuario u JOIN u.disenos d " +
            "GROUP BY u.nombre ORDER BY COUNT(d.id) DESC")
    List<UsuarioDisenosDTO> findUsuariosConMasDisenos();


    @Query("SELECT u.nombre, SUM(p.monto) AS total FROM Usuario u JOIN Pago p ON u.id = p.usuario.id GROUP BY u.nombre ORDER BY total DESC")
    List<Object[]> findUsuariosConMayorGasto();
}

