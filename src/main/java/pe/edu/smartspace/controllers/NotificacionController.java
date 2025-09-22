package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.NotificacionDTO;
import pe.edu.smartspace.entities.Notificacion;
import pe.edu.smartspace.mappers.NotificacionMapper;
import pe.edu.smartspace.servicesinterfaces.INotificacionService;

import java.util.List;

@RestController
@RequestMapping("/api/notificaciones")

public class NotificacionController {

    private final INotificacionService notificacionService;

    public NotificacionController(INotificacionService notificacionService) {
        this.notificacionService = notificacionService;
    }

    @PostMapping
    public NotificacionDTO registrar(@RequestBody NotificacionDTO dto) {
        Notificacion n = NotificacionMapper.toEntity(dto);
        return NotificacionMapper.toDTO(notificacionService.registrarNotificacion(n, dto.getIdUsuario()));
    }

    @GetMapping
    public List<NotificacionDTO> listar() {
        return notificacionService.listarNotificaciones().stream().map(NotificacionMapper::toDTO).toList();
    }

    @GetMapping("/{id}")
    public NotificacionDTO buscar(@PathVariable Long id) {
        return NotificacionMapper.toDTO(notificacionService.buscarPorId(id));
    }
}
