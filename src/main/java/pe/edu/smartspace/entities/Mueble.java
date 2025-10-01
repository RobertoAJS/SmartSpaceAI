package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "muebles")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Mueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String categoria;
    private String dimension;
    private String estilo;
    private Double precio;
    private Boolean sostenibilidad;
    private String proveedor;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Boolean getSostenibilidad() {
        return sostenibilidad;
    }

    public void setSostenibilidad(Boolean sostenibilidad) {
        this.sostenibilidad = sostenibilidad;
    }
}
