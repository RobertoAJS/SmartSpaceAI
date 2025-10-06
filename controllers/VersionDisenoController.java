package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.VersionDisenoDTO;
import pe.edu.smartspace.servicesinterfaces.IVersionDisenoService;

import java.util.List;

@RestController
@RequestMapping("/api/versiones")
public class VersionDisenoController {

    private final IVersionDisenoService versionDisenoService;

    public VersionDisenoController(IVersionDisenoService versionDisenoService) {
        this.versionDisenoService = versionDisenoService;
    }

    @PostMapping
    public VersionDisenoDTO registrar(@RequestBody VersionDisenoDTO dto) {
        return versionDisenoService.registrarVersionDiseno(dto);
    }

    @GetMapping
    public List<VersionDisenoDTO> listar() {
        return versionDisenoService.listarVersiones();
    }

    @GetMapping("/{id}")
    public VersionDisenoDTO buscar(@PathVariable Long id) {
        return versionDisenoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        versionDisenoService.eliminar(id);
    }
}
