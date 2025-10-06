package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.ComentarioDTO;
import pe.edu.smartspace.servicesinterfaces.IComentarioService;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {

    private final IComentarioService comentarioService;

    public ComentarioController(IComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @PostMapping
    public ComentarioDTO registrar(@RequestBody ComentarioDTO dto) {
        return comentarioService.registrarComentario(dto);
    }

    @GetMapping
    public List<ComentarioDTO> listar() {
        return comentarioService.listarComentarios();
    }

    @GetMapping("/{id}")
    public ComentarioDTO buscar(@PathVariable Long id) {
        return comentarioService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        comentarioService.eliminar(id);
    }
}
