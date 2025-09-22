package pe.edu.smartspace.dtos;

import java.util.Date;

public class VersionDisenoDTO {
    private Long id;
    private Long idDiseno;
    private Date fecha;
    private String archivoModelo;
    private String cambios;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getIdDiseno() { return idDiseno; }
    public void setIdDiseno(Long idDiseno) { this.idDiseno = idDiseno; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public String getArchivoModelo() { return archivoModelo; }
    public void setArchivoModelo(String archivoModelo) { this.archivoModelo = archivoModelo; }
    public String getCambios() { return cambios; }
    public void setCambios(String cambios) { this.cambios = cambios; }
}
