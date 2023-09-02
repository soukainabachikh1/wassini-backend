package com.cmr.wassini.Models;

import com.cmr.wassini.enums.userRelationships;

import java.sql.Time;
import java.util.Date;

public class Reservation {
    private long id;
    private String nomComplet;
    private String nomCompletAr;
    private String cinDefunt;
    private userRelationships userRelationship;
    private Date startDate;
    private Date endDate;
    private Time startHour;
    private Time endHour;
}
