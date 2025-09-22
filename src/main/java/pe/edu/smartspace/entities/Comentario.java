package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "comentarios")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "diseno_id")
    private Diseno diseno;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "texto_comentario", columnDefinition = "TEXT")
    private String textoComentario;

    @Temporal(TemporalType.DATE)
    private Date fecha;
}
