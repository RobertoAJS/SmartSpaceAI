package pe.edu.smartspace.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.smartspace.dtos.CategoriaPopularDTO;
import pe.edu.smartspace.dtos.FavoritoDTO;
import pe.edu.smartspace.entities.Favorito;
import pe.edu.smartspace.entities.Mueble;
import pe.edu.smartspace.entities.Usuario;
import pe.edu.smartspace.mappers.FavoritoMapper;
import pe.edu.smartspace.servicesinterfaces.IFavoritoService;
import pe.edu.smartspace.servicesinterfaces.IUsuarioService;
import pe.edu.smartspace.servicesinterfaces.IMuebleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/favoritos")
public class FavoritoController {

    private final IFavoritoService favoritoService;
    private final IUsuarioService usuarioService;
    private final IMuebleService muebleService;

    public FavoritoController(
            IFavoritoService favoritoService,
            IUsuarioService usuarioService,
            IMuebleService muebleService
    ) {
        this.favoritoService = favoritoService;
        this.usuarioService = usuarioService;
        this.muebleService = muebleService;
    }

    @PostMapping
    public FavoritoDTO registrar(@RequestBody FavoritoDTO dto) {
        Usuario usuario = usuarioService.buscarPorId(dto.getUsuarioId());
        Mueble mueble = muebleService.buscarPorId(dto.getMuebleId());

        Favorito favorito = FavoritoMapper.toEntity(dto, usuario, mueble);
        return FavoritoMapper.toDTO(favoritoService.registrarFavorito(favorito));
    }

    @GetMapping
    public List<FavoritoDTO> listar() {
        return favoritoService.listarFavoritos()
                .stream()
                .map(FavoritoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FavoritoDTO buscar(@PathVariable Long id) {
        Favorito favorito = favoritoService.buscarPorId(id);
        return favorito != null ? FavoritoMapper.toDTO(favorito) : null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        favoritoService.eliminarFavorito(id);
    }

    @GetMapping("/categorias-populares")
    public List<CategoriaPopularDTO> getCategoriasMasPopulares() {
        return favoritoService.obtenerCategoriasMasPopulares();
    }
}
