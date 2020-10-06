package com.optimize.optimizedzoenamcore.finder;

import com.franktech.common.finder.BaseFinder;
import com.franktech.common.util.State;
import com.optimize.optimizedzoenamcore.entities.Client;
import com.optimize.optimizedzoenamcore.repository.specification.ClientSpec;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.Specification;

@EqualsAndHashCode(callSuper = true)
@Data
public class ClientFinder extends BaseFinder<Client> {

    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String adresse;
    private State state;


    @Override
    public Specification<Client> getCriteres() {
        return ClientSpec.getCriteres(this);
    }
}
