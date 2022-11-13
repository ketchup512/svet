package com.company.zive_tvory.ryby;
import com.company.zive_tvory.Tvor;
import com.company.zive_tvory.stavovce_diely.Stavovec;

import java.util.Date;

public abstract class Ryba extends Stavovec {

    public Ryba(int pocet_stavcov) {
        super(pocet_stavcov);
    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_die) {

    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z){
        setY(direction_y);
        setX(direction_x);
        setZ(direction_z);
        System.out.println("Plavam, lebo zijem vo vode, bo rybka som");
    }
}
