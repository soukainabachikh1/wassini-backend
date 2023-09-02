package com.cmr.wassini.Models;

import jakarta.persistence.*;

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

    public String getCIN() {
        return CIN;
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
