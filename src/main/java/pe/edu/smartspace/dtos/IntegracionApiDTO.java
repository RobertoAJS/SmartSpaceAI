package pe.edu.smartspace.dtos;

import java.util.Date;

public class IntegracionApiDTO {
    private Long id;
    private Long idUsuario;
    private String tipoApi;
    private String estado;
    private Date fechaUso;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }
    public String getTipoApi() { return tipoApi; }
    public void setTipoApi(String tipoApi) { this.tipoApi = tipoApi; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Date getFechaUso() { return fechaUso; }
    public void setFechaUso(Date fechaUso) { this.fechaUso = fechaUso; }
}
