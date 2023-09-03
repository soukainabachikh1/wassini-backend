package com.cmr.wassini.Models;

import jakarta.persistence.*;

@Entity
@Table(name="conjoint")
public class Conjoint {
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

    @ManyToOne
    @JoinColumn(name = "cinDefunt")
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

}
