package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "comentarios")
@Getter
@Setter
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario")
    private Long idComentario;

    @ManyToOne
    @JoinColumn(name = "id_diseno", nullable = false)
    private Diseno diseno;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "texto_comentario", columnDefinition = "TEXT", nullable = false)
    private String textoComentario;

    @Column(name = "fecha")
    private LocalDate fecha;
}
