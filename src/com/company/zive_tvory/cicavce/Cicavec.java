package com.company.zive_tvory.cicavce;

import com.company.zive_tvory.stavovce.stavovce_diely.Stavovec;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.nervova.Nervova_sustava_cicavec;

public abstract class Cicavec extends Stavovec implements cicable{

    private float temperature;


    @Override
    public void create_sustavy() {
        sustavy[0] = new Obehova_sustava_stavovec(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Oporna_sustava_stavovec(Typ_sustavy.OPORNA);
        sustavy[2] = new Vylucovacia_sustava_stavovec(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Pohybova_sustava_stavovec(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Dychacia_sustava_stavovec(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Travacia_sustava_stavovec(Typ_sustavy.TRAVACIA);
        sustavy[6] = new Rozmnozovacia_sustava_stavovec(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA);
    }

    public Cicavec(int pocet_stavcov) {
        super(pocet_stavcov);
        this.temperature = 36;
    }
}
