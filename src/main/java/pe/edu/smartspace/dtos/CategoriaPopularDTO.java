package pe.edu.smartspace.dtos;

public class CategoriaPopularDTO {
    private String categoria;
    private Long totalFavoritos;

    public CategoriaPopularDTO(String categoria, Long totalFavoritos) {
        this.categoria = categoria;
        this.totalFavoritos = totalFavoritos;
    }

    public String getCategoria() { return categoria; }
    public Long getTotalFavoritos() { return totalFavoritos; }
}
