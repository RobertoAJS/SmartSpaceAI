package pe.edu.smartspace.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Campo real de login
    @Column(nullable = false, unique = true)
    private String username;

    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;

    private boolean enabled;

    // Relación con diseños
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Diseno> disenos;

    // Métodos auxiliares para Spring Security
    public boolean isEnabled() {
        return this.enabled;
    }

    public List<Diseno> getDisenos() {
        return disenos;
    }

    public void setDisenos(List<Diseno> disenos) {
        this.disenos = disenos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}



