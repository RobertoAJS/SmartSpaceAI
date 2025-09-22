package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.VersionDisenoDTO;
import pe.edu.smartspace.entities.VersionDiseno;
import pe.edu.smartspace.mappers.VersionDisenoMapper;
import pe.edu.smartspace.servicesinterfaces.IVersionDisenoService;

import java.util.List;

@RestController
@RequestMapping("/api/versiones")
public class VersionDisenoController {

    private final IVersionDisenoService versionService;

    public VersionDisenoController(IVersionDisenoService versionService) {
        this.versionService = versionService;
    }

    @PostMapping
    public VersionDisenoDTO registrar(@RequestBody VersionDisenoDTO dto) {
        VersionDiseno v = VersionDisenoMapper.toEntity(dto);
        return VersionDisenoMapper.toDTO(versionService.registrarVersion(v, dto.getIdDiseno()));
    }

    @GetMapping
    public List<VersionDisenoDTO> listar() {
        return versionService.listarVersiones().stream().map(VersionDisenoMapper::toDTO).toList();
    }

    @GetMapping("/{id}")
    public VersionDisenoDTO buscar(@PathVariable Long id) {
        return VersionDisenoMapper.toDTO(versionService.buscarPorId(id));
    }
}
