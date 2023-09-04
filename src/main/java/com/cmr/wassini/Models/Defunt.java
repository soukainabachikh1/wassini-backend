package com.cmr.wassini.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "defunt")
public class Defunt {

    @Id
    @Column(nullable = false)
    private String cin;
    @Column(nullable = false)
    private boolean isRetired;
    @Column(nullable = false)
    private boolean hasChildren;

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



}
