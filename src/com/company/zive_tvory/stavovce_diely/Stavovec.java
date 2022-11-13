package com.company.zive_tvory.stavovce_diely;

import com.company.zive_tvory.stavovce_diely.Chrbtica;
import com.company.zive_tvory.Tvor;

import java.time.Instant;
import java.util.Date;

public class Stavovec extends Tvor{

    protected Chrbtica chrbtica;
    protected Sustava[] sustavy;

    private void create_sustavy(){
        sustavy[0] = new Sustava(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Sustava(Typ_sustavy.OPORNA);
        sustavy[2] = new Sustava(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Sustava(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Sustava(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Sustava(Typ_sustavy.TRAVACIA);
        sustavy[6] = new Sustava(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Sustava(Typ_sustavy.NERVOVA);
    }
    public Stavovec(int pocet_stavcov ) {
        this.chrbtica = new Chrbtica(pocet_stavcov);
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
