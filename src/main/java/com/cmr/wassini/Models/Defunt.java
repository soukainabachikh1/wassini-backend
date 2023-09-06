package com.cmr.wassini.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "defunt")
public class Defunt implements Serializable {

    @Id
    @Column(nullable = false)
    private String cin;
    @Column(nullable = false)
    private boolean isRetired;
    @Column(nullable = false)
    private boolean hasChildren;

    @OneToMany(mappedBy = "defunt", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Enfant> enfants;

    @OneToMany(mappedBy = "defunt", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Conjoint> conjoints;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
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



}
