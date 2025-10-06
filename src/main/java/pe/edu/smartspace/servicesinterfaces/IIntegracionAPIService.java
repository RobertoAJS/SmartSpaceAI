package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.dtos.IntegracionAPIDTO;
import java.util.List;

public interface IIntegracionAPIService {
    IntegracionAPIDTO crearIntegracion(IntegracionAPIDTO dto);
    IntegracionAPIDTO obtenerIntegracionPorId(Long id);
    List<IntegracionAPIDTO> listarIntegraciones();
    IntegracionAPIDTO actualizarIntegracion(Long id, IntegracionAPIDTO dto);
    void eliminarIntegracion(Long id);
}
