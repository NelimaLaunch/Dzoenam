package com.optimize.optimizedzoenamcore.entities;

import com.franktech.common.entity.AbstractAuditingEntity;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "DZSOCL")
public class SocieteCliente extends AbstractAuditingEntity {
    @Column(name = "SOCLID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "SOCLNAM")
    private String nom;

    public SocieteCliente() {
    }

    public SocieteCliente(String nom) {
        this.nom = nom;
    }


    public SocieteCliente(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocieteCliente societeCliente = (SocieteCliente) o;
        return id.equals(societeCliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Societe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
