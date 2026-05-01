package viana.vkmotocar.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import viana.vkmotocar.dto.GastoDTO;
import viana.vkmotocar.model.Gasto;
import viana.vkmotocar.service.GastoService;

@RestController
@RequestMapping("/gastos")
@RequiredArgsConstructor
public class GastoController {

    private final GastoService gastoService;

    @PostMapping
    public ResponseEntity<Gasto> cadastrar(@RequestBody @Valid GastoDTO dto) {
        Gasto novoGasto = gastoService.salvarGasto(dto);
        return ResponseEntity.ok(novoGasto);
    }
}