package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.PagoDTO;
import pe.edu.smartspace.entities.Pago;
import pe.edu.smartspace.mappers.PagoMapper;
import pe.edu.smartspace.servicesinterfaces.IPagoService;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {
    private final IPagoService pagoService;

    public PagoController(IPagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping
    public PagoDTO registrar(@RequestBody PagoDTO dto) {
        Pago p = PagoMapper.toEntity(dto);
        return PagoMapper.toDTO(pagoService.registrarPago(p, dto.getIdUsuario()));
    }

    @GetMapping
    public List<PagoDTO> listar() {
        return pagoService.listarPagos().stream().map(PagoMapper::toDTO).toList();
    }

    @GetMapping("/{id}")
    public PagoDTO buscar(@PathVariable Long id) {
        return PagoMapper.toDTO(pagoService.buscarPorId(id));
    }
}
