package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "integraciones_api")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IntegracionAPI {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntegracion;

    private String tipoServicio;

    private String apiKey;

    private String estado;

    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
