package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "favoritos")
@IdClass(FavoritoId.class)
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

public class Favorito {
    @Id
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "mueble_id")
    private Mueble mueble;
}
