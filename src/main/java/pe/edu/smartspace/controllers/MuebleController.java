package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.CategoriaPromedioDTO;
import pe.edu.smartspace.dtos.MuebleDTO;
import pe.edu.smartspace.dtos.MueblePromDTO;
import pe.edu.smartspace.entities.Mueble;
import pe.edu.smartspace.mappers.MuebleMapper;
import pe.edu.smartspace.repositories.IMuebleRepository;

import java.util.List;

@RestController
@RequestMapping("/api/muebles")
public class MuebleController {

    private final IMuebleRepository muebleRepository;

    public MuebleController(IMuebleRepository muebleRepository) {
        this.muebleRepository = muebleRepository;
    }

    @PostMapping
    public MuebleDTO registrar(@RequestBody MuebleDTO dto) {
        Mueble mueble = MuebleMapper.toEntity(dto);
        return MuebleMapper.toDTO(muebleRepository.save(mueble));
    }

    @GetMapping
    public List<MuebleDTO> listar() {
        return muebleRepository.findAll().stream()
                .map(MuebleMapper::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public MuebleDTO buscar(@PathVariable Long id) {
        return muebleRepository.findById(id)
                .map(MuebleMapper::toDTO)
                .orElse(null);
    }

    @GetMapping("/promedio-proveedor")
    public List<MueblePromDTO> obtenerPromedioPorProveedor() {
        return muebleRepository.obtenerPromedioPrecioPorProveedor();
    }

    @GetMapping("/promedio-categoria")
    public List<CategoriaPromedioDTO> obtenerPromedioPorCategoria() {
        return muebleRepository.obtenerPromedioPrecioPorCategoria();
    }
}

