package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "integraciones_api")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntegracionAPI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntegracion;

    private String tipoServicio;

    private String apiKey;

    private String estado;

    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
