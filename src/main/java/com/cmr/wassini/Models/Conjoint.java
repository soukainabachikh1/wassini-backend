package com.cmr.wassini.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Conjoint {
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
    @Column(name = "unique_key_column", unique = true)
    private String cinDefunt;
}
