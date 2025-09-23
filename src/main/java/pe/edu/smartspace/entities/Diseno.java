package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "disenos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Diseno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    private String estado;

    // Relación con usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
