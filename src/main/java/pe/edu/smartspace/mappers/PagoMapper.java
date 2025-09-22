package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.PagoDTO;
import pe.edu.smartspace.entities.Pago;

public class PagoMapper {
    public static PagoDTO toDTO(Pago p) {
        if (p == null) return null;
        PagoDTO dto = new PagoDTO();
        dto.setId(p.getId());
        dto.setIdUsuario(p.getUsuario() != null ? p.getUsuario().getId() : null);
        dto.setPlan(p.getPlan());
        dto.setFechaInicio(p.getFechaInicio());
        dto.setFechaFin(p.getFechaFin());
        dto.setEstado(p.getEstado());
        dto.setMetodoPago(p.getMetodoPago());
        return dto;
    }

    public static Pago toEntity(PagoDTO dto) {
        if (dto == null) return null;
        Pago p = new Pago();
        p.setId(dto.getId());
        p.setPlan(dto.getPlan());
        p.setFechaInicio(dto.getFechaInicio());
        p.setFechaFin(dto.getFechaFin());
        p.setEstado(dto.getEstado());
        p.setMetodoPago(dto.getMetodoPago());
        return p;
    }
}
