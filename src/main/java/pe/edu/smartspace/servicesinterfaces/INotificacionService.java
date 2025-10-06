package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.dtos.NotificacionDTO;

import java.util.List;

public interface INotificacionService {
    NotificacionDTO registrarNotificacion(NotificacionDTO dto);
    List<NotificacionDTO> listarNotificaciones();
    NotificacionDTO buscarPorId(Long id);
    List<NotificacionDTO> listarPorUsuario(Long usuarioId);
    void eliminarNotificacion(Long id);
}
