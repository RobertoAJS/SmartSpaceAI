package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.dtos.VersionDisenoDTO;
import pe.edu.smartspace.entities.Diseno;
import pe.edu.smartspace.entities.VersionDiseno;
import pe.edu.smartspace.mappers.VersionDisenoMapper;
import pe.edu.smartspace.repositories.IDisenoRepository;
import pe.edu.smartspace.repositories.IVersionDisenoRepository;
import pe.edu.smartspace.servicesinterfaces.IVersionDisenoService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VersionDisenoServiceImpl implements IVersionDisenoService {

    private final IVersionDisenoRepository versionDisenoRepository;
    private final IDisenoRepository disenoRepository;
    private final VersionDisenoMapper mapper;

    public VersionDisenoServiceImpl(IVersionDisenoRepository versionDisenoRepository,
                                    IDisenoRepository disenoRepository,
                                    VersionDisenoMapper mapper) {
        this.versionDisenoRepository = versionDisenoRepository;
        this.disenoRepository = disenoRepository;
        this.mapper = mapper;
    }

    @Override
    public VersionDisenoDTO registrarVersionDiseno(VersionDisenoDTO dto) {
        Diseno diseno = disenoRepository.findById(dto.getIdDiseno())
                .orElseThrow(() -> new RuntimeException("Diseño no encontrado"));

        VersionDiseno entity = mapper.toEntity(dto, diseno);
        VersionDiseno saved = versionDisenoRepository.save(entity);
        return mapper.toDTO(saved);
    }

    @Override
    public List<VersionDisenoDTO> listarVersiones() {
        return versionDisenoRepository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public VersionDisenoDTO buscarPorId(Long id) {
        return versionDisenoRepository.findById(id)
                .map(mapper::toDTO)
                .orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        versionDisenoRepository.deleteById(id);
    }
}
