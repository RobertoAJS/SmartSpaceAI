package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.*;
import pe.edu.smartspace.repositories.*;
import pe.edu.smartspace.servicesinterfaces.IFavoritoService;

import java.util.List;

@Service
public class FavoritoServiceImpl implements IFavoritoService{

    private final IFavoritoRepository favoritoRepository;
    private final IUsuarioRepository usuarioRepository;
    private final IMuebleRepository muebleRepository;

    public FavoritoServiceImpl(IFavoritoRepository favoritoRepository,
                               IUsuarioRepository usuarioRepository,
                               IMuebleRepository muebleRepository) {
        this.favoritoRepository = favoritoRepository;
        this.usuarioRepository = usuarioRepository;
        this.muebleRepository = muebleRepository;
    }

    @Override
    public Favorito registrarFavorito(Long idUsuario, Long idMueble) {
        Usuario u = usuarioRepository.findById(idUsuario).orElse(null);
        Mueble m = muebleRepository.findById(idMueble).orElse(null);
        Favorito f = new Favorito(u, m);
        return favoritoRepository.save(f);
    }

    @Override
    public List<Favorito> listarFavoritos() {
        return favoritoRepository.findAll();
    }

    @Override
    public Favorito buscarPorId(Long idUsuario, Long idMueble) {
        Usuario u = usuarioRepository.findById(idUsuario).orElse(null);
        Mueble m = muebleRepository.findById(idMueble).orElse(null);
        if (u == null || m == null) return null;
        FavoritoId id = new FavoritoId(u.getId(), m.getId());
        return favoritoRepository.findById(id).orElse(null);
    }
}
