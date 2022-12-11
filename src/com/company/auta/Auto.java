package com.company.auta;

public abstract class  Auto {

    protected String Model;
    protected  String Znacka;

    public Auto() {
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getZnacka() {
        return Znacka;
    }

    public void setZnacka(String znacka) {
        Znacka = znacka;
    }
    @Override
    public String toString() {
        return "Znacka: " + Znacka + "Model: " + Model;
    }
}
