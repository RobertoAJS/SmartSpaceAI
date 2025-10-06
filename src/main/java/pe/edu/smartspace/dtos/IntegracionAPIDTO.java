package pe.edu.smartspace.dtos;

import java.time.LocalDateTime;

public class IntegracionAPIDTO {
    private Long idIntegracion;
    private String tipoServicio;
    private String apiKey;
    private String estado;
    private LocalDateTime fechaCreacion;
    private Long usuarioId;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdIntegracion() {
        return idIntegracion;
    }

    public void setIdIntegracion(Long idIntegracion) {
        this.idIntegracion = idIntegracion;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
