package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.Pago;
import java.util.List;

public interface IPagoService {
    Pago registrarPago(Pago pago, Long idUsuario);
    List<Pago> listarPagos();
    Pago buscarPorId(Long id);
}
