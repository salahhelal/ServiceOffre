package com.salah.atelier.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Offre {
    @Id
    @GeneratedValue
    private long code;
    private String intitule;
    private String specialite;
    private String societe;
    private int nbPostes;
    private String pays;

    public Offre() {
    }

  
    public Offre(String intitule, String specialite, String societe, int nbPostes, String pays) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
        this.nbPostes = nbPostes;
        this.pays = pays;
    }


    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public int getNbPostes() {
        return nbPostes;
    }

    public void setNbPostes(int nbPostes) {
        this.nbPostes = nbPostes;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}