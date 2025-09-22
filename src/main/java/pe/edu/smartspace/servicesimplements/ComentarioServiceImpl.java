package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.*;
import pe.edu.smartspace.repositories.*;
import pe.edu.smartspace.servicesinterfaces.IComentarioService;

import java.util.List;

@Service

public class ComentarioServiceImpl implements IComentarioService{

    private final IComentarioRepository comentarioRepository;
    private final IDisenoRepository disenoRepository;
    private final IUsuarioRepository usuarioRepository;

    public ComentarioServiceImpl(IComentarioRepository comentarioRepository,
                                 IDisenoRepository disenoRepository,
                                 IUsuarioRepository usuarioRepository) {
        this.comentarioRepository = comentarioRepository;
        this.disenoRepository = disenoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Comentario registrarComentario(Comentario comentario, Long idDiseno, Long idUsuario) {
        Diseno d = disenoRepository.findById(idDiseno).orElse(null);
        Usuario u = usuarioRepository.findById(idUsuario).orElse(null);
        comentario.setDiseno(d);
        comentario.setUsuario(u);
        return comentarioRepository.save(comentario);
    }

    @Override
    public List<Comentario> listarComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario buscarPorId(Long id) {
        return comentarioRepository.findById(id).orElse(null);
    }
}
