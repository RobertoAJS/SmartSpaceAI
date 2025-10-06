package pe.edu.smartspace.dtos;

public class UsuarioGastoDTO {
    private String nombreUsuario;
    private Double totalGastado;

    public UsuarioGastoDTO(String nombreUsuario, Double totalGastado) {
        this.nombreUsuario = nombreUsuario;
        this.totalGastado = totalGastado;
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public Double getTotalGastado() { return totalGastado; }
}
