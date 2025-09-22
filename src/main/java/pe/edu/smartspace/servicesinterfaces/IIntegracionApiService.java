package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.IntegracionApi;
import java.util.List;

public interface IIntegracionApiService {
    IntegracionApi registrarIntegracion(IntegracionApi integracion, Long idUsuario);
    List<IntegracionApi> listarIntegraciones();
    IntegracionApi buscarPorId(Long id);
}
