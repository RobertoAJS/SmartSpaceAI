package pe.edu.smartspace.servicesinterfaces;

import pe.edu.smartspace.dtos.UsuarioDisenosDTO;
import pe.edu.smartspace.entities.Usuario;
import java.util.List;

public interface IUsuarioService {
    Usuario registrarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario buscarPorId(Long id);
    List<UsuarioDisenosDTO> obtenerUsuariosConMasDisenos();
    List<Object[]> obtenerUsuariosConMayorGasto();
}
