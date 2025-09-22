package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "integraciones_api")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class IntegracionApi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "tipo_api", length = 30)
    private String tipoApi;

    @Column(length = 50)
    private String estado;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_uso")
    private Date fechaUso;
}
