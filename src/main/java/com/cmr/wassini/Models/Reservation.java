package com.cmr.wassini.Models;

import com.cmr.wassini.enums.userRelationships;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "reservation")
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getNomCompletAr() {
        return nomCompletAr;
    }

    public void setNomCompletAr(String nomCompletAr) {
        this.nomCompletAr = nomCompletAr;
    }

    public String getCinDefunt() {
        return cinDefunt;
    }

    public void setCinDefunt(String cinDefunt) {
        this.cinDefunt = cinDefunt;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public userRelationships getUserRelationship() {
        return userRelationship;
    }

    public void setUserRelationship(userRelationships userRelationship) {
        this.userRelationship = userRelationship;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Time getStartHour() {
        return startHour;
    }

    public void setStartHour(Time startHour) {
        this.startHour = startHour;
    }

    public Time getEndHour() {
        return endHour;
    }

    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }
}
