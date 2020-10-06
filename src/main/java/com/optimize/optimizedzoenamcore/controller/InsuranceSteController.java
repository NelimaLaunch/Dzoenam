package com.optimize.optimizedzoenamcore.controller;

import com.franktech.common.controller.GenericController;
import com.franktech.common.exception.CustomException;
import com.franktech.common.util.Response;
import com.franktech.common.util.StateWrapper;
import com.optimize.optimizedzoenamcore.entities.InsuranceSociety;
import com.optimize.optimizedzoenamcore.finder.InsuranceSteFinder;
import com.optimize.optimizedzoenamcore.service.InsuranceSteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * controleur exposant les endpoints des sociétés d'assurance
 *
 * @author Francis AHONSU
 * @since 05-10-2020
 */
@RestController
@RequestMapping("insurance-society")
public class InsuranceSteController extends GenericController<InsuranceSociety, Long> {

    public InsuranceSteController(InsuranceSteService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<Response> create(InsuranceSociety insuranceSociety) throws CustomException {
        return super.create(insuranceSociety);
    }

    @GetMapping
    public ResponseEntity<Response> getAll() throws CustomException {
        return super.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Response> getOne(@PathVariable("id") Long id) throws CustomException {
        return super.getOne(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<Response> update(@PathVariable("id") Long id, @RequestBody InsuranceSociety insuranceSociety) throws CustomException {
        return super.update(id, insuranceSociety);
    }

    @PutMapping("state/{id}")
    public ResponseEntity<Response> changeState(@PathVariable("id") Long id, @RequestBody StateWrapper stateWrapper) throws CustomException {
        return super.changeState(id, stateWrapper);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Response> delete(@PathVariable("id") Long id) throws CustomException {
        return super.delete(id);
    }

    @PostMapping("search")
    public ResponseEntity<Response> search(@RequestBody InsuranceSteFinder finder) throws CustomException {
        return super.search(finder);
    }
}
