package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.dtos.NotificacionDTO;
import pe.edu.smartspace.entities.Notificacion;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.mappers.NotificacionMapper;
import pe.edu.smartspace.repositories.INotificacionRepository;
import pe.edu.smartspace.repositories.IUsuarioRepository;
import pe.edu.smartspace.servicesinterfaces.INotificacionService;

import java.util.List;
import java.util.stream.Collectors;

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
    public NotificacionDTO registrarNotificacion(NotificacionDTO dto) {
        Usuario usuario = usuarioRepository.findById(dto.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        Notificacion notificacion = NotificacionMapper.toEntity(dto, usuario);
        return NotificacionMapper.toDTO(notificacionRepository.save(notificacion));
    }

    @Override
    public List<NotificacionDTO> listarNotificaciones() {
        return notificacionRepository.findAll()
                .stream()
                .map(NotificacionMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public NotificacionDTO buscarPorId(Long id) {
        return notificacionRepository.findById(id)
                .map(NotificacionMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Notificación no encontrada"));
    }

    @Override
    public List<NotificacionDTO> listarPorUsuario(Long usuarioId) {
        return notificacionRepository.findByUsuarioId(usuarioId)
                .stream()
                .map(NotificacionMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void eliminarNotificacion(Long id) {
        notificacionRepository.deleteById(id);
    }
}
