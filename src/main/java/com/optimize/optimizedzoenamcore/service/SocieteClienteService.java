package com.optimize.optimizedzoenamcore.service;

import com.franktech.common.exception.CustomException;
import com.franktech.common.repository.GenericRepository;
import com.franktech.common.service.GenericService;
import com.optimize.optimizedzoenamcore.entities.SocieteCliente;
import com.optimize.optimizedzoenamcore.repository.SocieteClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SocieteClienteService extends GenericService<SocieteCliente, Long> {
    private SocieteClienteRepository societeClienteRepository;

    public SocieteClienteService(GenericRepository<SocieteCliente, Long> repository) {
        super(repository);
    }


    @Override
    public boolean delete(Long id) throws CustomException {
        return super.delete(id);
    }

    @Override
    public SocieteCliente create(SocieteCliente societeCliente) {
        return super.create(societeCliente);
    }

    @Override
    public SocieteCliente update(SocieteCliente societeCliente) {
        return societeClienteRepository.saveAndFlush(societeCliente);
    }

    @Override
    public List<SocieteCliente> getAll() {
        return super.getAll();
    }

    @Override
    public SocieteCliente getOne(Long id) {
        return super.getOne(id);
    }

    @Autowired
    public void setSocieteClienteRepository(SocieteClienteRepository societeClienteRepository) {
        this.societeClienteRepository = societeClienteRepository;
    }
}
