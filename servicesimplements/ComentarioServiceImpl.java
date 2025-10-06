package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.dtos.ComentarioDTO;
import pe.edu.smartspace.entities.Comentario;
import pe.edu.smartspace.entities.Diseno;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.mappers.ComentarioMapper;
import pe.edu.smartspace.repositories.IComentarioRepository;
import pe.edu.smartspace.repositories.IDisenoRepository;
import pe.edu.smartspace.repositories.IUsuarioRepository;
import pe.edu.smartspace.servicesinterfaces.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComentarioServiceImpl implements IComentarioService {

    private final IComentarioRepository comentarioRepository;
    private final IDisenoRepository disenoRepository;
    private final IUsuarioRepository usuarioRepository;
    private final ComentarioMapper mapper;

    public ComentarioServiceImpl(IComentarioRepository comentarioRepository,
                                 IDisenoRepository disenoRepository,
                                 IUsuarioRepository usuarioRepository,
                                 ComentarioMapper mapper) {
        this.comentarioRepository = comentarioRepository;
        this.disenoRepository = disenoRepository;
        this.usuarioRepository = usuarioRepository;
        this.mapper = mapper;
    }

    @Override
    public ComentarioDTO registrarComentario(ComentarioDTO dto) {
        Diseno diseno = disenoRepository.findById(dto.getIdDiseno())
                .orElseThrow(() -> new RuntimeException("Diseño no encontrado"));
        Usuario usuario = usuarioRepository.findById(dto.getIdUsuario())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Comentario entity = mapper.toEntity(dto, diseno, usuario);
        Comentario saved = comentarioRepository.save(entity);
        return mapper.toDTO(saved);
    }

    @Override
    public List<ComentarioDTO> listarComentarios() {
        return comentarioRepository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ComentarioDTO buscarPorId(Long id) {
        return comentarioRepository.findById(id)
                .map(mapper::toDTO)
                .orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        comentarioRepository.deleteById(id);
    }
}
