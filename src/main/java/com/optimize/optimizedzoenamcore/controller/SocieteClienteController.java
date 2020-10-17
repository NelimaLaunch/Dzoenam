package com.optimize.optimizedzoenamcore.controller;

import com.franktech.common.controller.GenericController;
import com.franktech.common.exception.CustomException;
import com.franktech.common.util.Response;
import com.optimize.optimizedzoenamcore.dto.SocieteClienteDto;
import com.optimize.optimizedzoenamcore.entities.SocieteCliente;
import com.optimize.optimizedzoenamcore.finder.SocieteClienteFinder;
import com.optimize.optimizedzoenamcore.mapper.SocieteClienteMapper;
import com.optimize.optimizedzoenamcore.service.SocieteClienteService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/societes-cliente")
public class SocieteClienteController extends GenericController<SocieteCliente, Long> {
    private final SocieteClienteMapper mapper;
    public SocieteClienteController(SocieteClienteService service, SocieteClienteMapper mapper) {
        super(service);
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<Response> create(@RequestBody @Valid SocieteClienteDto dto) throws CustomException {
        SocieteCliente societeCliente = mapper.fromSocieteClienteDto(dto);
        return super.create(societeCliente);
    }

    @DeleteMapping("{id}")
    @Override
    public ResponseEntity<Response> delete(@PathVariable Long id) throws CustomException {
        return super.delete(id);
    }

    @GetMapping("{id}")
    @Override
    public ResponseEntity<Response> getOne(@PathVariable Long id) throws CustomException {
        return super.getOne(id);
    }

    @GetMapping
    @Override
    public ResponseEntity<Response> getAll(Pageable pageable) throws CustomException {
        return super.getAll(pageable);
    }

    @PutMapping
    public ResponseEntity<Response> update(Long id, @RequestBody SocieteClienteDto dto) throws CustomException {
        SocieteCliente societeCliente = mapper.fromSocieteClienteDto(dto);
        return super.update(id, societeCliente);
    }

    @PostMapping("search")
    public ResponseEntity<Response> search(@RequestBody SocieteClienteFinder finder) throws CustomException {
        return super.search(finder);
    }
}
