package viana.vkmotocar.model;

import jakarta.persistence.*;
import lombok.Data;
import viana.vkmotocar.model.enums.ManutencaoPadrao;
import viana.vkmotocar.model.enums.TipoGasto;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private Integer kmNoMomento;

    @Enumerated(EnumType.STRING)
    private TipoGasto categoria;

    @Enumerated(EnumType.STRING)
    private ManutencaoPadrao itemManutencao;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;
}