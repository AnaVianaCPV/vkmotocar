package viana.vkmotocar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import viana.vkmotocar.model.TipoVeiculo;
import viana.vkmotocar.model.TipoCombustivel;

public record VeiculoDTO(
        @NotBlank(message = "O nome do veículo é obrigatório")
        String nome,

        @NotNull(message = "O tipo (CARRO/MOTO) é obrigatório")
        TipoVeiculo tipo,

        @NotNull(message = "O tipo de combustível é obrigatório")
        TipoCombustivel combustivel,

        @NotBlank(message = "A placa é obrigatória")
        String placa
) {}