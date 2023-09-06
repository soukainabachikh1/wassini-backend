package com.cmr.wassini.Models;

import com.cmr.wassini.enums.userRelationships;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nomComplet;

    @Column
    private String nomCompletArabe;
    @Column(nullable = false)
    private String tel;

    @Column(nullable = false)
    private String userRelationship;

    @Column(nullable = false)
//    @JsonFormat(pattern = "dd/MM/yyyy")
    private String startDate;

    @Column(nullable = false)
//    @JsonFormat(pattern = "dd/MM/yyyy")
    private String endDate;

    @Column(nullable = false)
    private String startHour;

    @Column(nullable = false)
    private String endHour;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "cinDefunt")
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private Defunt defunt;

    @Column(nullable = false)
    private String cinDefunt;


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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserRelationship() {
        return userRelationship;
    }

    public void setUserRelationship(String userRelationship) {
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

//    public Defunt getDefunt() {
//        return defunt;
//    }
//
//    public void setDefunt(Defunt defunt) {
//        this.defunt = defunt;
//    }

    public String getCinDefunt() {
        return cinDefunt;
    }

    public void setCinDefunt(String cinDefunt) {
        this.cinDefunt = cinDefunt;
    }
}
