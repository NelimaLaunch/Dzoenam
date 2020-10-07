package com.optimize.optimizedzoenamcore.service;

import com.franktech.common.repository.GenericRepository;
import com.franktech.common.service.GenericService;
import com.optimize.optimizedzoenamcore.entities.Client;
import com.optimize.optimizedzoenamcore.repository.ClientRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Objects;

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
        Client old = getOne(client.getId());
        if(Objects.nonNull(client.getNom())){
            old.setNom(client.getNom());
        }
        old.setLastModifiedDate(new Date());
         return create(old);
    }
}
