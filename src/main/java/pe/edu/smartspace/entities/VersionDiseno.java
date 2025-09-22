package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "versiones_disenos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VersionDiseno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVersion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diseno", nullable = false)
    private Diseno diseno;

    private LocalDate fecha;

    @Column(length = 255)
    private String archivoModelo;

    @Column(length = 255)
    private String comentarios;
}
