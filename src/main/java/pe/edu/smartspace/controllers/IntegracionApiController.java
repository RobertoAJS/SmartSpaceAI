package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.IntegracionApiDTO;
import pe.edu.smartspace.entities.IntegracionApi;
import pe.edu.smartspace.mappers.IntegracionApiMapper;
import pe.edu.smartspace.servicesinterfaces.IIntegracionApiService;

import java.util.List;

@RestController
@RequestMapping("/api/integraciones")
public class IntegracionApiController {

    private final IIntegracionApiService integracionService;

    public IntegracionApiController(IIntegracionApiService integracionService) {
        this.integracionService = integracionService;
    }

    @PostMapping
    public IntegracionApiDTO registrar(@RequestBody IntegracionApiDTO dto) {
        IntegracionApi i = IntegracionApiMapper.toEntity(dto);
        return IntegracionApiMapper.toDTO(integracionService.registrarIntegracion(i, dto.getIdUsuario()));
    }

    @GetMapping
    public List<IntegracionApiDTO> listar() {
        return integracionService.listarIntegraciones().stream().map(IntegracionApiMapper::toDTO).toList();
    }

    @GetMapping("/{id}")
    public IntegracionApiDTO buscar(@PathVariable Long id) {
        return IntegracionApiMapper.toDTO(integracionService.buscarPorId(id));
    }
}
