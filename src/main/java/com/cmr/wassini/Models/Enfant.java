package com.cmr.wassini.Models;

import com.cmr.wassini.enums.InfirmityTypes;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "enfant")
public class Enfant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_enfant;
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

}
