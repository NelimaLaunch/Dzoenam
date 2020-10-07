package com.optimize.optimizedzoenamcore.repository.specification;

import com.franktech.common.repository.spec.BaseSpecifications;
import com.optimize.optimizedzoenamcore.entities.Client;
import com.optimize.optimizedzoenamcore.entities.InsuranceSociety;
import com.optimize.optimizedzoenamcore.finder.ClientFinder;
import com.optimize.optimizedzoenamcore.finder.InsuranceSteFinder;
import org.springframework.data.jpa.domain.Specification;

public class InsuranceSteSpec extends BaseSpecifications {

    /**
     * les spécification de recherche d'un client
     * @param insuranceSteFinder le model de banque à rechercher
     * @return la ou les société d'assurance respectants les critères de selections
     */
    public static Specification<InsuranceSociety> getCriteres(InsuranceSteFinder insuranceSteFinder){
        Specification<InsuranceSociety> spec = Specification.where((root, query, cb) -> cb.equal(cb.literal(1), 1));
        spec = contains(spec, "raisonSociale", insuranceSteFinder.getRaisonSociale());
        spec = equal(spec, "state", insuranceSteFinder.getState());
        spec = contains(spec, "email", insuranceSteFinder.getEmail());
        spec = contains(spec, "tel", insuranceSteFinder.getTel());

        return spec;
    }

}
