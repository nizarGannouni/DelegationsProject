package com.gannouni.nizar.formationandroid;

import java.io.Serializable;

/**
 * Created by Nizar on 25/03/2018.
 */

public class Delegation implements Serializable{
    private String nom;
    private String adresse;
    private int phone;

    public Delegation(String nom, String adresse, int phone) {
        this.nom = nom;
        this.adresse = adresse;
        this.phone = phone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Delegation{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", phone=" + phone +
                '}';
    }
}
