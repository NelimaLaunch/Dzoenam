package com.optimize.optimizedzoenamcore.entities;

import com.franktech.common.entity.AbstractAuditingEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long nom;

    public Client() {
    }

    public Client(Long nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNom() {
        return nom;
    }

    public void setNom(Long nom) {
        this.nom = nom;
    }
}
