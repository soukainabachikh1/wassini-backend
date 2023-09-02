package com.cmr.wassini.Models;

import com.cmr.wassini.enums.InfirmityTypes;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "enfant")
public class Enfant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nom;
    @Column
    private Date dateOfBirth;
    @Column
    private boolean isCurrently;
    @Column
    private boolean isMarried;
    @Column
    private boolean isInfirm;
    @Column
    private InfirmityTypes infirmityType;
    @Column(name = "unique_key_column", unique = true)
    private String cinDefunt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isCurrently() {
        return isCurrently;
    }

    public void setCurrently(boolean currently) {
        isCurrently = currently;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isInfirm() {
        return isInfirm;
    }

    public void setInfirm(boolean infirm) {
        isInfirm = infirm;
    }

    public InfirmityTypes getInfirmityType() {
        return infirmityType;
    }

    public void setInfirmityType(InfirmityTypes infirmityType) {
        this.infirmityType = infirmityType;
    }

    public String getCinDefunt() {
        return cinDefunt;
    }

    public void setCinDefunt(String cinDefunt) {
        this.cinDefunt = cinDefunt;
    }
}
