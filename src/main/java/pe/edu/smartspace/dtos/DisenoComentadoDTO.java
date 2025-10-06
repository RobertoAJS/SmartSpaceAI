package pe.edu.smartspace.dtos;

public class DisenoComentadoDTO {
    private String nombreDiseno;
    private Long totalComentarios;

    public DisenoComentadoDTO(String nombreDiseno, Long totalComentarios) {
        this.nombreDiseno = nombreDiseno;
        this.totalComentarios = totalComentarios;
    }

    public String getNombreDiseno() { return nombreDiseno; }
    public Long getTotalComentarios() { return totalComentarios; }
}
