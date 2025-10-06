package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.UsuarioDTO;
import pe.edu.smartspace.dtos.UsuarioDisenosDTO;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.mappers.UsuarioMapper;
import pe.edu.smartspace.servicesinterfaces.IUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {

        this.usuarioService = usuarioService;
    }

    @PostMapping
    public UsuarioDTO registrar(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.toEntity(usuarioDTO);
        Usuario savedUsuario = usuarioService.registrarUsuario(usuario);
        return UsuarioMapper.toDTO(savedUsuario);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return usuarioService.listarUsuarios()
                .stream()
                .map(UsuarioMapper::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public UsuarioDTO buscar(@PathVariable Long id) {
        Usuario usuario = usuarioService.buscarPorId(id);
        return UsuarioMapper.toDTO(usuario);
    }

    @GetMapping("/mas-disenos")
    public List<UsuarioDisenosDTO> getUsuariosConMasDisenos() {
        return usuarioService.obtenerUsuariosConMasDisenos();
    }

    @GetMapping("/mayor-gasto")
    public List<Object[]> getUsuariosConMayorGasto() {
        return usuarioService.obtenerUsuariosConMayorGasto();
    }
}
