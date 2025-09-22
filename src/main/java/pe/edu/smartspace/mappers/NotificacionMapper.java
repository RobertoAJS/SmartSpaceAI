package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.NotificacionDTO;
import pe.edu.smartspace.entities.Notificacion;

public class NotificacionMapper {
    public static NotificacionDTO toDTO(Notificacion n) {
        if (n == null) return null;
        NotificacionDTO dto = new NotificacionDTO();
        dto.setId(n.getId());
        dto.setIdUsuario(n.getUsuario() != null ? n.getUsuario().getId() : null);
        dto.setTipo(n.getTipo());
        dto.setMensaje(n.getMensaje());
        dto.setEstado(n.getEstado());
        dto.setFecha(n.getFecha());
        return dto;
    }

    public static Notificacion toEntity(NotificacionDTO dto) {
        if (dto == null) return null;
        Notificacion n = new Notificacion();
        n.setId(dto.getId());
        n.setTipo(dto.getTipo());
        n.setMensaje(dto.getMensaje());
        n.setEstado(dto.getEstado());
        n.setFecha(dto.getFecha());
        return n;
    }
}
