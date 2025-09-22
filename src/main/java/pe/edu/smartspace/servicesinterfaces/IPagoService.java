package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.Pago;
import java.util.List;

public interface IPagoService {
    Pago registrarPago(Pago pago);
    List<Pago> listarPagos();
    Pago buscarPorId(Long id);
    void eliminarPago(Long id);
}
