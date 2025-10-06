package pe.edu.smartspace.dtos;

public class UsuarioDisenosDTO {
    private String nombreUsuario;
    private Long totalDisenos;

    public UsuarioDisenosDTO(String nombreUsuario, Long totalDisenos) {
        this.nombreUsuario = nombreUsuario;
        this.totalDisenos = totalDisenos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public Long getTotalDisenos() {
        return totalDisenos;
    }
}
