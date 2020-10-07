package com.optimize.optimizedzoenamcore.service;

import com.franktech.common.service.GenericService;
import com.optimize.optimizedzoenamcore.entities.InsuranceSociety;
import com.optimize.optimizedzoenamcore.repository.InsuranceSteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.Objects;

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
        InsuranceSociety old = getOne(insuranceSociety.getId());
        if(Objects.nonNull(insuranceSociety.getAdresse())){
            old.setAdresse(insuranceSociety.getAdresse());
        }
        if(Objects.nonNull(insuranceSociety.getEmail())){
            old.setEmail(insuranceSociety.getEmail());
        }
        if(Objects.nonNull(insuranceSociety.getRaisonSociale())){
            old.setRaisonSociale(insuranceSociety.getRaisonSociale());
        }
        if(Objects.nonNull(insuranceSociety.getTel())){
            old.setTel(insuranceSociety.getTel());
        }
        old.setLastModifiedDate(new Date());
         return create(old);
    }
}
