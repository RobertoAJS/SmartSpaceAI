package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "versiones_disenos")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class VersionDiseno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "diseno_id")
    private Diseno diseno;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "archivo_modelo", length = 255)
    private String archivoModelo;

    @Column(name = "cambios", length = 255)
    private String cambios; // notas/cambios de la versión
}
