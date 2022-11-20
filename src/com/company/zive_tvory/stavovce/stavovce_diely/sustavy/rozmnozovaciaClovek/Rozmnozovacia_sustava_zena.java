package com.company.zive_tvory.stavovce.stavovce_diely.sustavy.rozmnozovaciaClovek;

import com.company.zive_tvory.clovecina.Clovek;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Rozmnozovacia_sustava_stavovec;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Typ_sustavy;

public class Rozmnozovacia_sustava_zena extends Rozmnozovacia_sustava_stavovec {

    private int BabyDevelopmentPogress = 0;

    public Rozmnozovacia_sustava_zena(Typ_sustavy typ_sustavy) {
        super(typ_sustavy);
    }

    public int takeAndCareBaby(Clovek plod){
        while (BabyDevelopmentPogress != 100){
            BabyDevelopmentPogress++;
        }
        plod.create_sustavy();
        return BabyDevelopmentPogress;
    }
}
