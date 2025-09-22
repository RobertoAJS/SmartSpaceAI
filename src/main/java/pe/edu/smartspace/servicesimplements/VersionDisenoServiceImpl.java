package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.*;
import pe.edu.smartspace.repositories.*;
import pe.edu.smartspace.servicesinterfaces.IVersionDisenoService;

import java.util.List;

@Service

public class VersionDisenoServiceImpl  implements IVersionDisenoService  {
    private final IVersionDisenoRepository versionRepository;
    private final IDisenoRepository disenoRepository;

    public VersionDisenoServiceImpl(IVersionDisenoRepository versionRepository,
                                    IDisenoRepository disenoRepository) {
        this.versionRepository = versionRepository;
        this.disenoRepository = disenoRepository;
    }

    @Override
    public VersionDiseno registrarVersion(VersionDiseno version, Long idDiseno) {
        Diseno d = disenoRepository.findById(idDiseno).orElse(null);
        version.setDiseno(d);
        return versionRepository.save(version);
    }

    @Override
    public List<VersionDiseno> listarVersiones() {
        return versionRepository.findAll();
    }

    @Override
    public VersionDiseno buscarPorId(Long id) {
        return versionRepository.findById(id).orElse(null);
    }
}
