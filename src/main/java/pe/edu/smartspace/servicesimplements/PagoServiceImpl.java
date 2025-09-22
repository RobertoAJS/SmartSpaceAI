package pe.edu.smartspace.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.smartspace.entities.*;
import pe.edu.smartspace.repositories.*;
import pe.edu.smartspace.servicesinterfaces.IPagoService;

import java.util.List;

@Service

public class PagoServiceImpl implements IPagoService{
    private final IPagoRepository pagoRepository;
    private final IUsuarioRepository usuarioRepository;

    public PagoServiceImpl(IPagoRepository pagoRepository, IUsuarioRepository usuarioRepository) {
        this.pagoRepository = pagoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Pago registrarPago(Pago pago, Long idUsuario) {
        Usuario u = usuarioRepository.findById(idUsuario).orElse(null);
        pago.setUsuario(u);
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
}
