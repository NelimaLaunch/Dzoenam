package com.optimize.optimizedzoenamcore.service;

import com.franktech.common.service.GenericService;
import com.optimize.optimizedzoenamcore.entities.InsuranceSociety;
import com.optimize.optimizedzoenamcore.repository.InsuranceSteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * service d'une société d'assurance
 *
 * @author Francis AHONSU
 * @since 05-10-2020
 */
@Service
@Transactional
public class InsuranceSteService extends GenericService<InsuranceSociety, Long> {

    public InsuranceSteService(InsuranceSteRepository repository) {
        super(repository);
    }

    @Override
    public InsuranceSociety update(InsuranceSociety insuranceSociety) {
        return null;
    }
}
