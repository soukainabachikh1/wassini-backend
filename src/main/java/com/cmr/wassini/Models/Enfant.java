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
    private String nom;
    private String nomArabe;
    @Column(nullable = false)
    private Date dateOfBirth;
    @Column(nullable = false)
    private boolean isCurrentlyStudying;
    @Column(nullable = false)
    private boolean isMarried;
    @Column(nullable = false)
    private boolean isInfirm;
    @Column
    private InfirmityTypes infirmityType;
    @ManyToOne
    @JoinColumn(name = "cinDefunt")
    private Defunt defunt;

    public Enfant(long id, String nom, String nomArabe, Date dateOfBirth, boolean isCurrentlyStudying, boolean isMarried, boolean isInfirm, InfirmityTypes infirmityType, Defunt defunt) {
        this.id = id;
        this.nom = nom;
        this.nomArabe = nomArabe;
        this.dateOfBirth = dateOfBirth;
        this.isCurrentlyStudying = isCurrentlyStudying;
        this.isMarried = isMarried;
        this.isInfirm = isInfirm;
        this.infirmityType = infirmityType;
        this.defunt = defunt;
    }

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

    public boolean isCurrentlyStudying() {
        return isCurrentlyStudying;
    }

    public void setCurrentlyStudying(boolean currentlyStudying) {
        isCurrentlyStudying = currentlyStudying;
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

    @Override
    public String toString() {
        return "Enfant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nomArabe='" + nomArabe + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", isCurrentlyStudying=" + isCurrentlyStudying +
                ", isMarried=" + isMarried +
                ", isInfirm=" + isInfirm +
                ", infirmityType=" + infirmityType +
                ", CIN parent décédé=" + defunt +
                '}';
    }
}
