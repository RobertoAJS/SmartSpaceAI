package pe.edu.smartspace.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.IntegracionAPI;
import pe.edu.smartspace.repositories.IIntegracionAPIRepository;
import pe.edu.smartspace.servicesinterfaces.IIntegracionAPIService;
import pe.edu.smartspace.dtos.IntegracionAPIDTO;
import pe.edu.smartspace.mappers.IntegracionAPIMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IntegracionAPIServiceImpl implements IIntegracionAPIService {

    @Autowired
    private IIntegracionAPIRepository repository;

    @Override
    public IntegracionAPIDTO crearIntegracion(IntegracionAPIDTO dto) {
        IntegracionAPI entity = IntegracionAPIMapper.toEntity(dto);
        IntegracionAPI saved = repository.save(entity);
        return IntegracionAPIMapper.toDTO(saved);
    }

    @Override
    public IntegracionAPIDTO obtenerIntegracionPorId(Long id) {
        IntegracionAPI entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Integración no encontrada"));
        return IntegracionAPIMapper.toDTO(entity);
    }

    @Override
    public List<IntegracionAPIDTO> listarIntegraciones() {
        return repository.findAll().stream()
                .map(IntegracionAPIMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public IntegracionAPIDTO actualizarIntegracion(Long id, IntegracionAPIDTO dto) {
        IntegracionAPI entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Integración no encontrada"));

        entity.setTipoServicio(dto.getTipoServicio());
        entity.setApiKey(dto.getApiKey());
        entity.setEstado(dto.getEstado());
        entity.setFechaCreacion(dto.getFechaCreacion());
        if(dto.getUsuarioId() != null) {
            pe.edu.smartspace.entities.Usuario usuario = new pe.edu.smartspace.entities.Usuario();
            usuario.setId(dto.getUsuarioId());
            entity.setUsuario(usuario);
        }

        IntegracionAPI updated = repository.save(entity);
        return IntegracionAPIMapper.toDTO(updated);
    }

    @Override
    public void eliminarIntegracion(Long id) {
        repository.deleteById(id);
    }
}
