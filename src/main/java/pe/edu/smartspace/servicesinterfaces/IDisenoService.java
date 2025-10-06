package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.Diseno;
import java.util.List;

public interface IDisenoService {
    Diseno registrarDiseno(Diseno diseno, Long idUsuario);
    List<Diseno> listarDisenos();
    Diseno buscarPorId(Long id);
}
