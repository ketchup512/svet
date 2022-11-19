package com.company.zive_tvory.stavovce.stavovce_diely;

import com.company.zive_tvory.Tvor;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;

import java.util.Date;

public class Stavovec extends Tvor{

    protected Chrbtica chrbtica;
    protected Sustava[] sustavy = new Sustava[8];

    protected void create_sustavy(){
        sustavy[0] = new Obehova_sustava_stavovec(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Oporna_sustava_stavovec(Typ_sustavy.OPORNA);
        sustavy[2] = new Vylucovacia_sustava_stavovec(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Pohybova_sustava_stavovec(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Dychacia_sustava_stavovec(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Travacia_sustava_stavovec(Typ_sustavy.TRAVACIA);
        sustavy[6] = new Rozmnozovacia_sustava_stavovec(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Nervova_sustava_stavovec_default(Typ_sustavy.NERVOVA);
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

    public Sustava[] getSustavy() {
        return sustavy;
    }
}
