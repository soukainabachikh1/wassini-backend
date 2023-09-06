package com.cmr.wassini.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;

@Entity
@Table(name="conjoint")
public class Conjoint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String tel;
    @Column
    private boolean hasValidMarriagePeriod;
    @Column
    private String marialStatus;
    @Column
    private boolean isAlive;
    @Column
    private boolean isInfirm;
    @Column
    private boolean isRetired;
    @Column
    private String sexe;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cinDefunt", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Defunt defunt;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isHasValidMarriagePeriod() {
        return hasValidMarriagePeriod;
    }

    public void setHasValidMarriagePeriod(boolean hasValidMarriagePeriod) {
        this.hasValidMarriagePeriod = hasValidMarriagePeriod;
    }

    public String getMarialStatus() {
        return marialStatus;
    }

    public void setMarialStatus(String marialStatus) {
        this.marialStatus = marialStatus;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isInfirm() {
        return isInfirm;
    }

    public void setInfirm(boolean infirm) {
        isInfirm = infirm;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Defunt getDefunt() {
        return defunt;
    }

    public void setDefunt(Defunt defunt) {
        this.defunt = defunt;
    }
}
