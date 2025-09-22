package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.*;
import pe.edu.smartspace.repositories.*;
import pe.edu.smartspace.servicesinterfaces.IIntegracionApiService;

import java.util.List;

@Service
public class IntegracionApiServiceImpl implements IIntegracionApiService {
    private final IIntegracionApiRepository integracionRepository;
    private final IUsuarioRepository usuarioRepository;

    public IntegracionApiServiceImpl(IIntegracionApiRepository integracionRepository,
                                     IUsuarioRepository usuarioRepository) {
        this.integracionRepository = integracionRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public IntegracionApi registrarIntegracion(IntegracionApi i, Long idUsuario) {
        Usuario u = usuarioRepository.findById(idUsuario).orElse(null);
        i.setUsuario(u);
        return integracionRepository.save(i);
    }

    @Override
    public List<IntegracionApi> listarIntegraciones() {
        return integracionRepository.findAll();
    }

    @Override
    public IntegracionApi buscarPorId(Long id) {
        return integracionRepository.findById(id).orElse(null);
    }
}
