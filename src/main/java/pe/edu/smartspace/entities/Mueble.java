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
}
