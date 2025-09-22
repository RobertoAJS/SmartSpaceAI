package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.dtos.VersionDisenoDTO;

import java.util.List;

public interface IVersionDisenoService {

    VersionDisenoDTO registrarVersionDiseno(VersionDisenoDTO versionDisenoDTO);

    List<VersionDisenoDTO> listarVersiones();

    VersionDisenoDTO buscarPorId(Long id);

    void eliminar(Long id);
}
