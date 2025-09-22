package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.ComentarioDTO;
import pe.edu.smartspace.entities.Comentario;
import pe.edu.smartspace.mappers.ComentarioMapper;
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
        Comentario c = ComentarioMapper.toEntity(dto);
        return ComentarioMapper.toDTO(
                comentarioService.registrarComentario(c, dto.getIdDiseno(), dto.getIdUsuario())
        );
    }

    @GetMapping
    public List<ComentarioDTO> listar() {
        return comentarioService.listarComentarios().stream().map(ComentarioMapper::toDTO).toList();
    }

    @GetMapping("/{id}")
    public ComentarioDTO buscar(@PathVariable Long id) {
        return ComentarioMapper.toDTO(comentarioService.buscarPorId(id));
    }
}
