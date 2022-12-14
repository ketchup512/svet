package com.company.zive_tvory.cicavce;

import com.company.zive_tvory.stavovce.stavovce_diely.Stavovec;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.nervova.Nervova_sustava_cicavec;

public abstract class Cicavec extends Stavovec implements cicable{

    private float temperature;


    @Override
    public void create_sustavy() {
        sustavy.add(new Obehova_sustava_stavovec(Typ_sustavy.OBEHOVA));
        sustavy.add( new Oporna_sustava_stavovec(Typ_sustavy.OPORNA));
        sustavy.add( new Vylucovacia_sustava_stavovec(Typ_sustavy.VYLUCOVACIA));
        sustavy.add(new Pohybova_sustava_stavovec(Typ_sustavy.POHYBOVA));
        sustavy.add( new Travacia_sustava_stavovec(Typ_sustavy.TRAVACIA));
        sustavy.add( new Rozmnozovacia_sustava_stavovec(Typ_sustavy.ROZMNOZOVACIA));
        sustavy.add( new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA));
    }

    public Cicavec(int pocet_stavcov) {
        super(pocet_stavcov);
        this.temperature = 36;
    }
}
