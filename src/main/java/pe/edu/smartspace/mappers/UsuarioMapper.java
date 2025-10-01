package pe.edu.smartspace.mappers;

import pe.edu.smartspace.dtos.UsuarioDTO;
import pe.edu.smartspace.entities.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setNombre(usuario.getNombre());
        dto.setUsername(usuario.getUsername());
        dto.setEmail(usuario.getEmail());
        return dto;
    }

    public static Usuario toEntity(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());
        usuario.setNombre(dto.getNombre());
        usuario.setUsername(dto.getUsername());
        usuario.setEmail(dto.getEmail());
        return usuario;
    }
}
