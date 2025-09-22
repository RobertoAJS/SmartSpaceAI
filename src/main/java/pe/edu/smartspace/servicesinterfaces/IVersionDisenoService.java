package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.VersionDiseno;
import java.util.List;

public interface IVersionDisenoService {
    VersionDiseno registrarVersion(VersionDiseno version, Long idDiseno);
    List<VersionDiseno> listarVersiones();
    VersionDiseno buscarPorId(Long id);
}
