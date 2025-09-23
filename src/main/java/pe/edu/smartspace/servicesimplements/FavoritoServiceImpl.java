package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.Favorito;
import pe.edu.smartspace.repositories.IFavoritoRepository;
import pe.edu.smartspace.servicesinterfaces.IFavoritoService;

import java.util.List;

@Service
public class FavoritoServiceImpl implements IFavoritoService {

    private final IFavoritoRepository favoritoRepository;

    public FavoritoServiceImpl(IFavoritoRepository favoritoRepository) {
        this.favoritoRepository = favoritoRepository;
    }

    @Override
    public Favorito registrarFavorito(Favorito favorito) {
        return favoritoRepository.save(favorito);
    }

    @Override
    public List<Favorito> listarFavoritos() {
        return favoritoRepository.findAll();
    }

    @Override
    public Favorito buscarPorId(Long id) {
        return favoritoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarFavorito(Long id) {
        favoritoRepository.deleteById(id);
    }
}
