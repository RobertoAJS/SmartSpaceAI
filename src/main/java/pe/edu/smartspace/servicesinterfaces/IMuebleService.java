package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.dtos.MueblePromDTO;
import pe.edu.smartspace.entities.Mueble;
import java.util.List;

public interface IMuebleService {
    Mueble registrarMueble(Mueble mueble);
    List<Mueble> listarMuebles();
    Mueble buscarPorId(Long id);
    List<MueblePromDTO> obtenerPromedioPrecioPorProveedor();
}
