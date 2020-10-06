package com.optimize.optimizedzoenamcore.service;

import com.franktech.common.repository.GenericRepository;
import com.franktech.common.service.GenericService;
import com.optimize.optimizedzoenamcore.entities.Client;
import com.optimize.optimizedzoenamcore.repository.ClientRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Service du client
 *
 * @author Francis AHONSU
 * @since 05-10-2020
 */
@Service
@Transactional
public class ClientService extends GenericService<Client, Long> {

    public ClientService(ClientRepository repository) {
        super(repository);
    }

    @Override
    public Client update(Client client) {
        return null;
    }
}
