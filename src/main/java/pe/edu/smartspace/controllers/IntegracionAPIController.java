package pe.edu.smartspace.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.IntegracionAPIDTO;
import pe.edu.smartspace.servicesinterfaces.IIntegracionAPIService;

import java.util.List;

@RestController
@RequestMapping("/api/integraciones")
public class IntegracionAPIController {

    @Autowired
    private IIntegracionAPIService service;

    @PostMapping
    public IntegracionAPIDTO crearIntegracion(@RequestBody IntegracionAPIDTO dto) {
        return service.crearIntegracion(dto);
    }

    @GetMapping("/{id}")
    public IntegracionAPIDTO obtenerIntegracion(@PathVariable Long id) {
        return service.obtenerIntegracionPorId(id);
    }

    @GetMapping
    public List<IntegracionAPIDTO> listarIntegraciones() {
        return service.listarIntegraciones();
    }

    @PutMapping("/{id}")
    public IntegracionAPIDTO actualizarIntegracion(@PathVariable Long id, @RequestBody IntegracionAPIDTO dto) {
        return service.actualizarIntegracion(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminarIntegracion(@PathVariable Long id) {
        service.eliminarIntegracion(id);
    }
}
