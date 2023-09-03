package com.cmr.wassini.Models;

import com.cmr.wassini.enums.userRelationships;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    private String nomCompletArabe;

    @Column()
    private String cinDefunt;

    @Column
    private String tel;

    @Column
    private userRelationships userRelationship;

    @Column
//    @JsonFormat(pattern = "dd/MM/yyyy")
    private String startDate;

    @Column
//    @JsonFormat(pattern = "dd/MM/yyyy")
    private String endDate;

    @Column
    private String startHour;

    @Column
    private String endHour;

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

    public String getNomCompletArabe() {
        return nomCompletArabe;
    }

    public void setNomCompletArabe(String nomCompletArabe) {
        this.nomCompletArabe = nomCompletArabe;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
}
