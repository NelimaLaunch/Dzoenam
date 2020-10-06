package com.optimize.optimizedzoenamcore.entities;

import com.franktech.common.entity.AbstractAuditingEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Entité representant un client
 *
 * @author Francis AHONSU
 * @since 05-10-2020
 */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(nom, client.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom=" + nom +
                '}';
    }
}
