package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.PagoDTO;
import pe.edu.smartspace.entities.Pago;
import pe.edu.smartspace.entities.Usuario;

public class PagoMapper {

    public static PagoDTO toDTO(Pago pago) {
        PagoDTO dto = new PagoDTO();
        dto.setId(pago.getId());
        dto.setMonto(pago.getMonto());
        dto.setMetodoPago(pago.getMetodoPago());
        dto.setFechaPago(pago.getFechaPago());
        dto.setUsuarioId(pago.getUsuario().getId());
        return dto;
    }

    public static Pago toEntity(PagoDTO dto, Usuario usuario) {
        Pago pago = new Pago();
        pago.setId(dto.getId());
        pago.setMonto(dto.getMonto());
        pago.setMetodoPago(dto.getMetodoPago());
        pago.setFechaPago(dto.getFechaPago());
        pago.setUsuario(usuario);
        return pago;
    }
}
