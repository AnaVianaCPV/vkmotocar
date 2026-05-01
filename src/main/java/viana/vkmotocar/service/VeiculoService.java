package viana.vkmotocar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viana.vkmotocar.dto.VeiculoDTO;
import viana.vkmotocar.model.Veiculo;
import viana.vkmotocar.repository.VeiculoRepository;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
    }

    public Veiculo salvar(VeiculoDTO dto) {
        Veiculo v = new Veiculo();
        v.setNome(dto.nome());
        v.setTipo(dto.tipo());
        v.setCombustivel(dto.combustivel());
        v.setPlaca(dto.placa());
        return repository.save(v);
    }

    public Veiculo atualizar(Long id, VeiculoDTO dto) {
        Veiculo v = buscarPorId(id);
        v.setNome(dto.nome());
        v.setPlaca(dto.placa());

        return repository.save(v);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
