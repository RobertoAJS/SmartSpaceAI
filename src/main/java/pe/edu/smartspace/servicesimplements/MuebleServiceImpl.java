package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.Mueble;
import pe.edu.smartspace.repositories.IMuebleRepository;
import pe.edu.smartspace.servicesinterfaces.IMuebleService;

import java.util.List;

@Service
public class MuebleServiceImpl implements IMuebleService {

    private final IMuebleRepository muebleRepository;

    public MuebleServiceImpl(IMuebleRepository muebleRepository) {
        this.muebleRepository = muebleRepository;
    }

    @Override
    public Mueble registrarMueble(Mueble mueble) {
        return muebleRepository.save(mueble);
    }

    @Override
    public List<Mueble> listarMuebles() {
        return muebleRepository.findAll();
    }

    @Override
    public Mueble buscarPorId(Long id) {
        return muebleRepository.findById(id).orElse(null);
    }
}
