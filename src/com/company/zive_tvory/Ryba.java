package com.company.zive_tvory;
import com.company.zive_tvory.Tvor;

public class Ryba extends Tvor{

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z){
        setY(direction_y);
        setX(direction_x);
        setZ(direction_z);
        System.out.println("Plavam, lebo zijem vo vode, bo rybka som");
    }
}
