package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.DisenoDTO;
import pe.edu.smartspace.entities.Diseno;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.mappers.DisenoMapper;
import pe.edu.smartspace.repositories.IDisenoRepository;
import pe.edu.smartspace.repositories.IUsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/disenos")
public class DisenoController {

    private final IDisenoRepository disenoRepository;
    private final IUsuarioRepository usuarioRepository;

    public DisenoController(IDisenoRepository disenoRepository, IUsuarioRepository usuarioRepository) {
        this.disenoRepository = disenoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public DisenoDTO registrar(@RequestBody DisenoDTO dto) {
        Diseno diseno = DisenoMapper.toEntity(dto);
        if (dto.getIdUsuario() != null) {
            Usuario usuario = usuarioRepository.findById(dto.getIdUsuario()).orElse(null);
            diseno.setUsuario(usuario);
        }
        return DisenoMapper.toDTO(disenoRepository.save(diseno));
    }

    @GetMapping
    public List<DisenoDTO> listar() {
        return disenoRepository.findAll().stream()
                .map(DisenoMapper::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public DisenoDTO buscar(@PathVariable Long id) {
        return disenoRepository.findById(id)
                .map(DisenoMapper::toDTO)
                .orElse(null);
    }
}
