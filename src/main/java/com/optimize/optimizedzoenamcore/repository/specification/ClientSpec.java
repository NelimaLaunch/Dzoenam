package com.optimize.optimizedzoenamcore.repository.specification;

import com.franktech.common.repository.spec.BaseSpecifications;
import com.optimize.optimizedzoenamcore.entities.Client;
import com.optimize.optimizedzoenamcore.finder.ClientFinder;
import org.springframework.data.jpa.domain.Specification;

public class ClientSpec extends BaseSpecifications {
    /**
     * les spécification de recherche d'un client
     * @param clientFinder le model de banque à rechercher
     * @return la ou les clients respectants les critères de selections
     */
    public static Specification<Client> getCriteres(ClientFinder clientFinder){
        Specification<Client> spec = Specification.where((root, query, cb) -> cb.equal(cb.literal(1), 1));
        spec = contains(spec, "nom", clientFinder.getNom());
        spec = isEqual("state", clientFinder.getState());
        spec = contains(spec, "email", clientFinder.getEmail());
        spec = contains(spec, "tel", clientFinder.getTel());

        return spec;
    }
}
