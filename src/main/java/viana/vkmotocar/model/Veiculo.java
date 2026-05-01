package viana.vkmotocar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import viana.vkmotocar.model.enums.TipoCombustivel;
import viana.vkmotocar.model.enums.TipoVeiculo;

@Entity
@Table(name = "veiculos")
@Getter
@Setter
@NoArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do veículo é obrigatório")
    private String nome;

    @NotBlank(message = "A placa é obrigatória")
    @Column(unique = true)
    private String placa;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Informe se é CARRO ou MOTO")
    private TipoVeiculo tipo;

    @Enumerated(EnumType.STRING)
    private TipoCombustivel combustivel;


}
