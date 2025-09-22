package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.Notificacion;
import java.util.List;

public interface INotificacionService {
    Notificacion registrarNotificacion(Notificacion notificacion, Long idUsuario);
    List<Notificacion> listarNotificaciones();
    Notificacion buscarPorId(Long id);
}
