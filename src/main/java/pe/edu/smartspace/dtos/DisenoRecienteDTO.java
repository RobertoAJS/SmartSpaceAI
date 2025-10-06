package pe.edu.smartspace.dtos;

import java.util.Date;

public class DisenoRecienteDTO {
    private String nombre;
    private Date fechaCreacion;

    public DisenoRecienteDTO(String nombre, Date fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
}
