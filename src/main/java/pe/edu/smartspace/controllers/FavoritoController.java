package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.FavoritoDTO;
import pe.edu.smartspace.entities.Favorito;
import pe.edu.smartspace.mappers.FavoritoMapper;
import pe.edu.smartspace.servicesinterfaces.IFavoritoService;

import java.util.List;

@RestController
@RequestMapping("/api/favoritos")
public class FavoritoController {
    private final IFavoritoService favoritoService;

    public FavoritoController(IFavoritoService favoritoService) {
        this.favoritoService = favoritoService;
    }

    @PostMapping
    public FavoritoDTO registrar(@RequestBody FavoritoDTO dto) {
        Favorito f = favoritoService.registrarFavorito(dto.getIdUsuario(), dto.getIdMueble());
        return FavoritoMapper.toDTO(f);
    }

    @GetMapping
    public List<FavoritoDTO> listar() {
        return favoritoService.listarFavoritos().stream().map(FavoritoMapper::toDTO).toList();
    }

    @GetMapping("/{idUsuario}/{idMueble}")
    public FavoritoDTO buscar(@PathVariable Long idUsuario, @PathVariable Long idMueble) {
        return FavoritoMapper.toDTO(favoritoService.buscarPorId(idUsuario, idMueble));
    }
}
