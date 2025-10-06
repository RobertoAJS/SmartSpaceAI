package pe.edu.smartspace.dtos;

import java.time.LocalDate;

public class ComentarioDTO {
    private Long idComentario;
    private Long idDiseno;
    private Long idUsuario;
    private String textoComentario;
    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Long idComentario) {
        this.idComentario = idComentario;
    }

    public Long getIdDiseno() {
        return idDiseno;
    }

    public void setIdDiseno(Long idDiseno) {
        this.idDiseno = idDiseno;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTextoComentario() {
        return textoComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }
}
