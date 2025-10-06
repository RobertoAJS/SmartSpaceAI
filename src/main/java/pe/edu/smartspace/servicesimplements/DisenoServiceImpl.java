package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.Diseno;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.repositories.IDisenoRepository;
import pe.edu.smartspace.repositories.IUsuarioRepository;
import pe.edu.smartspace.servicesinterfaces.IDisenoService;

import java.util.List;

@Service
public class DisenoServiceImpl implements IDisenoService {

    private final IDisenoRepository disenoRepository;
    private final IUsuarioRepository usuarioRepository;

    public DisenoServiceImpl(IDisenoRepository disenoRepository, IUsuarioRepository usuarioRepository) {
        this.disenoRepository = disenoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Diseno registrarDiseno(Diseno diseno, Long idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);
        diseno.setUsuario(usuario);
        return disenoRepository.save(diseno);
    }

    @Override
    public List<Diseno> listarDisenos() {
        return disenoRepository.findAll();
    }

    @Override
    public Diseno buscarPorId(Long id) {
        return disenoRepository.findById(id).orElse(null);
    }
}
