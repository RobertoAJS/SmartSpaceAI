package pe.edu.smartspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.smartspace.entities.Notificacion;

public interface INotificacionRepository extends JpaRepository<Notificacion, Long> {
}
