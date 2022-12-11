package com.company.zive_tvory.stavovce.stavovce_diely;

import com.company.zive_tvory.Tvor;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;

import java.util.ArrayList;
import java.util.Date;

public class Stavovec extends Tvor{

    protected Chrbtica chrbtica;
    protected  ArrayList<Sustava> sustavy = new ArrayList<Sustava>();

    protected void create_sustavy(){
       sustavy.add(new Obehova_sustava_stavovec(Typ_sustavy.OBEHOVA));
        sustavy.add(new Oporna_sustava_stavovec(Typ_sustavy.OPORNA));
        sustavy.add(new Vylucovacia_sustava_stavovec(Typ_sustavy.VYLUCOVACIA));
        sustavy.add(new Pohybova_sustava_stavovec(Typ_sustavy.POHYBOVA));
        sustavy.add(new Dychacia_sustava_stavovec(Typ_sustavy.DYCHACIA));
        sustavy.add(new Travacia_sustava_stavovec(Typ_sustavy.TRAVACIA));
        sustavy.add(new Rozmnozovacia_sustava_stavovec(Typ_sustavy.ROZMNOZOVACIA));
        sustavy.add(new Nervova_sustava_stavovec_default(Typ_sustavy.NERVOVA));
    }
    public Stavovec(int pocet_stavcov ) {

        this.chrbtica = new Chrbtica(pocet_stavcov);
        //create_sustavy();
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_die) {

    }

    public ArrayList<Sustava> getSustavy() {
        return sustavy;
    }
}
