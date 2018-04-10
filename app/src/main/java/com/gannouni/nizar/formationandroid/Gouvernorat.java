package com.gannouni.nizar.formationandroid;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Nizar on 25/03/2018.
 */

public class Gouvernorat implements Serializable {
    private String label;
    private String description;
    ArrayList<Delegation> listeDelegetaions;

    public Gouvernorat(String label, String description) {
        this.label = label;
        this.description = description;
        listeDelegetaions = new ArrayList<>();
    }

    public Gouvernorat(String label) {
        this.label = label;
        listeDelegetaions = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Delegation> getListeDelegetaions() {
        return listeDelegetaions;
    }

    public void setListeDelegetaions(ArrayList<Delegation> listeDelegetaions) {
        this.listeDelegetaions = listeDelegetaions;
    }
}
