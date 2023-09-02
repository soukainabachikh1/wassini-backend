package com.cmr.wassini.Models;

import com.cmr.wassini.enums.userRelationships;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nomComplet;

    @Column
    private String nomCompletAr;

    @Column
    private String cinDefunt;

    @Column
    private String tel;

    @Column
    private userRelationships userRelationship;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private Time startHour;

    @Column
    private Time endHour;
}
