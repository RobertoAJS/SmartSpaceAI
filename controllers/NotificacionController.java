package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.NotificacionDTO;
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
        return notificacionService.registrarNotificacion(dto);
    }

    @GetMapping
    public List<NotificacionDTO> listar() {
        return notificacionService.listarNotificaciones();
    }

    @GetMapping("/{id}")
    public NotificacionDTO buscar(@PathVariable Long id) {
        return notificacionService.buscarPorId(id);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<NotificacionDTO> listarPorUsuario(@PathVariable Long usuarioId) {
        return notificacionService.listarPorUsuario(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        notificacionService.eliminarNotificacion(id);
    }
}
