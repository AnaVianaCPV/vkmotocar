package viana.vkmotocar.dto;

import jakarta.validation.constraints.NotNull;
import viana.vkmotocar.model.enums.ManutencaoPadrao;
import viana.vkmotocar.model.enums.TipoGasto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record GastoDTO(
        @NotNull Long veiculoId,
        @NotNull TipoGasto tipo,
        ManutencaoPadrao item,
        String descricaoOutros,
        @NotNull BigDecimal valor,
        @NotNull LocalDate data,
        Integer kmNoMomento
) {}