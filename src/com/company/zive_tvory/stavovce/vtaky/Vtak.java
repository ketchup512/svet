package com.company.zive_tvory.stavovce.vtaky;

import com.company.zive_tvory.stavovce.stavovce_diely.Stavovec;

import java.util.Date;

public abstract class Vtak extends Stavovec {

    public Vtak(int pocet_stavcov) {
        super(pocet_stavcov);
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z){
        setY(direction_y);
        setX(direction_x);
        setZ(direction_z);
        System.out.println("Ja lietim\n Lietam, lebo mam kridielka");
    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_die) {

    }
}
