package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "disenos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Diseno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDateTime fechaCreacion;

    // Relacion con Usuario (un usuario tiene muchos disenos)
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
