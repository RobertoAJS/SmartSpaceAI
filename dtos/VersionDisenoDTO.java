package pe.edu.smartspace.dtos;

import java.time.LocalDate;

public class VersionDisenoDTO {

    private Long idVersion;
    private Long id; // relación con Diseño
    private LocalDate fecha;
    private String archivoModelo;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getIdDiseno() {
        return id;
    }

    public void setIdDiseno(Long idDiseno) {
        this.id = idDiseno;
    }

    public Long getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(Long idVersion) {
        this.idVersion = idVersion;
    }
}
