package com.optimize.optimizedzoenamcore.finder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.franktech.common.finder.BaseFinder;
import com.optimize.optimizedzoenamcore.entities.SocieteCliente;
import com.optimize.optimizedzoenamcore.repository.specification.SocieteClienteSpec;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.Specification;

@EqualsAndHashCode(callSuper = true)
@Data
public class SocieteClienteFinder extends BaseFinder<SocieteCliente> {
    private String nom;

    @JsonIgnore
    @Override
    public Specification<SocieteCliente> getCriteres() {
        return SocieteClienteSpec.getCriteres(this);
    }
}
