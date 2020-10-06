package com.optimize.optimizedzoenamcore.finder;

import com.franktech.common.finder.BaseFinder;
import com.franktech.common.util.State;
import com.optimize.optimizedzoenamcore.entities.InsuranceSociety;
import com.optimize.optimizedzoenamcore.repository.specification.InsuranceSteSpec;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.Specification;

@EqualsAndHashCode(callSuper = true)
@Data
public class InsuranceSteFinder extends BaseFinder<InsuranceSociety> {

    private String raisonSociale;
    private String adresse;
    private String tel;
    private String email;
    private State state;

    @Override
    public Specification<InsuranceSociety> getCriteres() {
        return InsuranceSteSpec.getCriteres(this);
    }
}
