package com.company.zive_tvory;
import com.company.zive_tvory.Tvor;

public class Vtak extends Tvor {

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z){
        setY(direction_y);
        setX(direction_x);
        setZ(direction_z);
        System.out.println("Ja lietim\n Lietam, lebo mam kridielka");
    }

}
