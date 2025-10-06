package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.PagoDTO;
import pe.edu.smartspace.dtos.UsuarioGastoDTO;
import pe.edu.smartspace.entities.Pago;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.mappers.PagoMapper;
import pe.edu.smartspace.servicesinterfaces.IPagoService;
import pe.edu.smartspace.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {

    private final IPagoService pagoService;
    private final IUsuarioService usuarioService;

    public PagoController(IPagoService pagoService, IUsuarioService usuarioService) {
        this.pagoService = pagoService;
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public PagoDTO registrar(@RequestBody PagoDTO dto) {
        Usuario usuario = usuarioService.buscarPorId(dto.getUsuarioId());
        Pago pago = PagoMapper.toEntity(dto, usuario);
        return PagoMapper.toDTO(pagoService.registrarPago(pago));
    }

    @GetMapping
    public List<PagoDTO> listar() {
        return pagoService.listarPagos()
                .stream()
                .map(PagoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PagoDTO buscar(@PathVariable Long id) {
        Pago pago = pagoService.buscarPorId(id);
        return pago != null ? PagoMapper.toDTO(pago) : null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        pagoService.eliminarPago(id);
    }

    @GetMapping("/mayor-gasto")
    public List<UsuarioGastoDTO> getUsuariosConMayorGasto() {
        return pagoService.obtenerUsuariosConMayorGasto();
    }
}
