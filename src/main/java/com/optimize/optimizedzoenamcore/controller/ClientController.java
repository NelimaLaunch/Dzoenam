package com.optimize.optimizedzoenamcore.controller;

import com.franktech.common.controller.GenericController;
import com.franktech.common.exception.CustomException;
import com.franktech.common.util.Response;
import com.franktech.common.util.StateWrapper;
import com.optimize.optimizedzoenamcore.entities.Client;
import com.optimize.optimizedzoenamcore.finder.ClientFinder;
import com.optimize.optimizedzoenamcore.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controleur du client
 *
 * @author Francis AHONSU
 * @since 05-10-2020
 */

@RestController
@RequestMapping("clients")
public class ClientController extends GenericController<Client, Long> {

    public ClientController(ClientService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<Response> create(Client client) throws CustomException {
        return super.create(client);
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
    public ResponseEntity<Response> update(@PathVariable("id") Long id, @RequestBody Client client) throws CustomException {
        return super.update(id, client);
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
    public ResponseEntity<Response> search(@RequestBody ClientFinder finder) throws CustomException {
        return super.search(finder);
    }
}
