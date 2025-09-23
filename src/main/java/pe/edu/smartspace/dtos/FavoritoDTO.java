package pe.edu.smartspace.dtos;

import java.time.LocalDateTime;

public class FavoritoDTO {

    private Long id;
    private Long usuarioId;
    private Long muebleId;
    private LocalDateTime fechaAgregado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getMuebleId() {
        return muebleId;
    }

    public void setMuebleId(Long muebleId) {
        this.muebleId = muebleId;
    }

    public LocalDateTime getFechaAgregado() {
        return fechaAgregado;
    }

    public void setFechaAgregado(LocalDateTime fechaAgregado) {
        this.fechaAgregado = fechaAgregado;
    }
}
