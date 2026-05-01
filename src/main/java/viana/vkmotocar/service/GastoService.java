package viana.vkmotocar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import viana.vkmotocar.dto.GastoDTO;
import viana.vkmotocar.model.Gasto;
import viana.vkmotocar.model.Veiculo;
import viana.vkmotocar.repository.GastoRepository;
import viana.vkmotocar.repository.VeiculoRepository;

@Service
@RequiredArgsConstructor // Cria o construtor para as injeções automáticas
public class GastoService {

    private final GastoRepository gastoRepository;
    private final VeiculoRepository veiculoRepository;

    @Transactional
    public Gasto salvarGasto(GastoDTO dto) {
        Veiculo veiculo = veiculoRepository.findById(dto.veiculoId())
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado!"));

        Gasto gasto = new Gasto();
        gasto.setVeiculo(veiculo);
        gasto.setCategoria(dto.tipo());
        gasto.setItemManutencao(dto.item());
        gasto.setDescricao(dto.descricaoOutros());
        gasto.setValor(dto.valor());
        gasto.setData(dto.data());
        gasto.setKmNoMomento(dto.kmNoMomento());

        return gastoRepository.save(gasto);
    }
}