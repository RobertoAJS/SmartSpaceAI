package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.Pago;
import pe.edu.smartspace.repositories.IPagoRepository;
import pe.edu.smartspace.servicesinterfaces.IPagoService;

import java.util.List;

@Service
public class PagoServiceImpl implements IPagoService {

    private final IPagoRepository pagoRepository;

    public PagoServiceImpl(IPagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @Override
    public Pago registrarPago(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public List<Pago> listarPagos() {
        return pagoRepository.findAll();
    }

    @Override
    public Pago buscarPorId(Long id) {
        return pagoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarPago(Long id) {
        pagoRepository.deleteById(id);
    }
}
