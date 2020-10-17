package com.optimize.optimizedzoenamcore.repository.specification;

import com.franktech.common.repository.spec.BaseSpecifications;
import com.optimize.optimizedzoenamcore.entities.SocieteCliente;
import com.optimize.optimizedzoenamcore.finder.SocieteClienteFinder;
import org.springframework.data.jpa.domain.Specification;

public class SocieteClienteSpec extends BaseSpecifications {
    public static Specification<SocieteCliente> getCriteres(SocieteClienteFinder finder) {
        Specification<SocieteCliente> spec = Specification.where((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(criteriaBuilder.literal(1), 1));
        spec = contains(spec, "nom", finder.getNom());
        return spec;
    }
}
