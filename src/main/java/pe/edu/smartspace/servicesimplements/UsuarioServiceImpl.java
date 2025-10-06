package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.dtos.UsuarioDisenosDTO;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.repositories.IUsuarioRepository;
import pe.edu.smartspace.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private final IUsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) { return usuarioRepository.save(usuario); }


    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<UsuarioDisenosDTO> obtenerUsuariosConMasDisenos() {
        return usuarioRepository.findUsuariosConMasDisenos();
    }

    @Override
    public List<Object[]> obtenerUsuariosConMayorGasto() {
        return usuarioRepository.findUsuariosConMayorGasto();
    }
}
