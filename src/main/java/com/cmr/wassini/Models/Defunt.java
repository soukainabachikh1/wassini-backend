package com.cmr.wassini.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "defunt")
public class Defunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CIN;
    @Column
    private boolean isRetired;
    @Column
    private boolean hasChildren;
    @OneToMany(mappedBy = "defunt")
    private List<Enfant> enfants;

    @OneToMany(mappedBy = "defunt")
    private List<Conjoint> conjoints;

    public String getCIN() {
        return CIN;
    }

    public List<Enfant> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<Enfant> enfants) {
        this.enfants = enfants;
    }

    public List<Conjoint> getConjoints() {
        return conjoints;
    }

    public void setConjoints(List<Conjoint> conjoints) {
        this.conjoints = conjoints;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
