package com.edelph.models;

import com.edelph.utils.Edate;


public class Donneur extends Personne {
    private int code;
    private String profession;
    private String CIN;
    private String lieuNaissance;
    private Edate dateNaissance;
    private String adresse;
    private String contact;


    public int getCode() {
        return code;
    }

    public Donneur setCode(int code) {
        this.code = code;
        return this;
    }

    public String getProfession() {
        return profession;
    }

    public Donneur setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public String getCIN() {
        return CIN;
    }

    public Donneur setCIN(String CIN) {
        this.CIN = CIN;
        return this;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public Donneur setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
        return this;
    }

    public Edate getDateNaissance() {
        return dateNaissance;
    }

    public Donneur setDateNaissance(Edate dateNaissance) {
        this.dateNaissance = dateNaissance;
        return this;
    }

    public String getAdresse() {
        return adresse;
    }

    public Donneur setAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public Donneur setContact(String contact) {
        this.contact = contact;
        return this;
    }
}
