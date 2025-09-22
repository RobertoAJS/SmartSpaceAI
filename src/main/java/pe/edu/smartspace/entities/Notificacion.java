package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "notificaciones")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(length = 50)
    private String tipo;

    @Column(length = 250)
    private String mensaje;

    @Column(length = 20)
    private String estado;

    @Temporal(TemporalType.DATE)
    private Date fecha;
}
