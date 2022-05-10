package com.edelph.models;

import com.edelph.dao.models.sang.GroupeSanguin;
import com.edelph.dao.models.sex.Sex;

import java.util.Date;

public class Personne {
    private int code;
    private String nom;
    private String prenom;
    private Sex sex;
    private int age;
    private GroupeSanguin groupeSanguin;

    public int getCode() {
        return code;
    }

    public Personne setCode(int code) {
        this.code = code;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Personne setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public Personne setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public Personne setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Personne setAge(int age) {
        this.age = age;
        return this;
    }

    public GroupeSanguin getGroupeSanguin() {
        return groupeSanguin;
    }

    public Personne setGroupeSanguin(GroupeSanguin groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
        return this;
    }
}
