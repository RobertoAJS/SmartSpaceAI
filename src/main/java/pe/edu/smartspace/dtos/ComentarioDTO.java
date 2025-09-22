package pe.edu.smartspace.dtos;

import java.util.Date;

public class ComentarioDTO {
    private Long id;
    private Long idDiseno;
    private Long idUsuario;
    private String textoComentario;
    private Date fecha;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdDiseno() { return idDiseno; }
    public void setIdDiseno(Long idDiseno) { this.idDiseno = idDiseno; }

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public String getTextoComentario() { return textoComentario; }
    public void setTextoComentario(String textoComentario) { this.textoComentario = textoComentario; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}
