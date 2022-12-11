package com.company.zive_tvory.cicavce;

import com.company.zive_tvory.Tvor;

import java.util.Date;

public class Delfin extends Tvor {
    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z){
        setY(direction_y);
        setX(direction_x);
        setZ(direction_z);
        System.out.println("Plavam, lebo zijem vo vode. A sprevadzam namornikov");
    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_die) {

    }
}
