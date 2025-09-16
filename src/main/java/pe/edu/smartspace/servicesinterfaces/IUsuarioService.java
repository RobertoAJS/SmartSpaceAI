package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.entities.Usuario;
import java.util.List;

public interface IUsuarioService {
    Usuario registrarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario buscarPorId(Long id);
}
