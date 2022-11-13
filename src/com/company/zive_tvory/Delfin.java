package com.company.zive_tvory;

public class Delfin extends Tvor{
    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z){
        setY(direction_y);
        setX(direction_x);
        setZ(direction_z);
        System.out.println("Plavam, lebo zijem vo vode. A sprevadzam namornikov");
    }
}
