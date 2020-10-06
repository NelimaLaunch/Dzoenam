package com.optimize.optimizedzoenamcore.entities;

import com.franktech.common.entity.AbstractAuditingEntity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Entité representant une société d'assurance
 *
 * @author Francis AHONSU
 * @since 05-10-2020
 */
@Entity(name = "DNISO")
public class InsuranceSociety extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISOID")
    private Long id;
    @Column(name = "ISORSS")
    private String raisonSociale;
    @Column(name = "ISOADR")
    private String adresse;
    @Column(name = "ISOTEL")
    private String tel;
    @Column(name = "ISOEMA")
    private String email;

    public InsuranceSociety() {
    }

    public InsuranceSociety(String raisonSociale, String adresse, String tel, String email) {
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsuranceSociety that = (InsuranceSociety) o;
        return id.equals(that.id) &&
                raisonSociale.equals(that.raisonSociale) &&
                Objects.equals(adresse, that.adresse) &&
                tel.equals(that.tel) &&
                email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, raisonSociale, adresse, tel, email);
    }

    @Override
    public String toString() {
        return "InsuranceSociety{" +
                "id=" + id +
                ", raisonSociale='" + raisonSociale + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
