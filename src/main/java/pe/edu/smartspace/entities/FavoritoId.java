package pe.edu.smartspace.entities;

import lombok.*;
import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class FavoritoId implements Serializable {
    private Long usuario; // coincide con el nombre del atributo en Favorito
    private Long mueble;  // coincide con el nombre del atributo en Favorito
}
