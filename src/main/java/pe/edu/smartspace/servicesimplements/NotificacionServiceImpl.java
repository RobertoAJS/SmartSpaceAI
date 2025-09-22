package pe.edu.smartspace.servicesimplements;


import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.*;
import pe.edu.smartspace.repositories.*;
import pe.edu.smartspace.servicesinterfaces.INotificacionService;

import java.util.List;

@Service
public class NotificacionServiceImpl implements INotificacionService {
    private final INotificacionRepository notificacionRepository;
    private final IUsuarioRepository usuarioRepository;

    public NotificacionServiceImpl(INotificacionRepository notificacionRepository,
                                   IUsuarioRepository usuarioRepository) {
        this.notificacionRepository = notificacionRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Notificacion registrarNotificacion(Notificacion n, Long idUsuario) {
        Usuario u = usuarioRepository.findById(idUsuario).orElse(null);
        n.setUsuario(u);
        return notificacionRepository.save(n);
    }

    @Override
    public List<Notificacion> listarNotificaciones() {
        return notificacionRepository.findAll();
    }

    @Override
    public Notificacion buscarPorId(Long id) {
        return notificacionRepository.findById(id).orElse(null);
    }
}
