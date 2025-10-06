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

    public String getArchivoModelo() {
        return archivoModelo;
    }

    public void setArchivoModelo(String archivoModelo) {
        this.archivoModelo = archivoModelo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Diseno getDiseno() {
        return diseno;
    }

    public void setDiseno(Diseno diseno) {
        this.diseno = diseno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(Long idVersion) {
        this.idVersion = idVersion;
    }
}
