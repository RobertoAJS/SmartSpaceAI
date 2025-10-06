package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.NotificacionDTO;
import pe.edu.smartspace.entities.Notificacion;
import pe.edu.smartspace.entities.Usuario;

public class NotificacionMapper {

    public static NotificacionDTO toDTO(Notificacion notificacion) {
        NotificacionDTO dto = new NotificacionDTO();
        dto.setId(notificacion.getId());
        dto.setMensaje(notificacion.getMensaje());
        dto.setLeido(notificacion.getLeido());
        dto.setFechaEnvio(notificacion.getFechaEnvio());
        dto.setUsuarioId(notificacion.getUsuario().getId());
        return dto;
    }

    public static Notificacion toEntity(NotificacionDTO dto, Usuario usuario) {
        Notificacion notificacion = new Notificacion();
        notificacion.setId(dto.getId());
        notificacion.setMensaje(dto.getMensaje());
        notificacion.setLeido(dto.getLeido());
        notificacion.setFechaEnvio(dto.getFechaEnvio());
        notificacion.setUsuario(usuario);
        return notificacion;
    }
}
