package com.company.space.vesmirneTelesa;
import com.company.zive_tvory.Tvor;

public class Zem extends Planeta{

    private Tvor[] poleTvorov;
    private int pocet_Tvorov;

    public Zem(String name, double vaha, double priemer) {
        super(name, vaha, priemer);
        poleTvorov = new Tvor[9999];
        pocet_Tvorov = 0;
    }

    public Zem(String name, double vaha, double priemer, double gravitacia) {
        super(name, vaha, priemer, gravitacia);
        poleTvorov = new Tvor[9999];
        pocet_Tvorov = 0;
    }

    public void addTvor(Tvor tvor){
        poleTvorov[pocet_Tvorov] = tvor;
        ++pocet_Tvorov;
    }

    public Tvor[] getPoleTvorov() {
        return poleTvorov;
    }

    public int getPocet_Tvorov() {
        return pocet_Tvorov;
    }
}

