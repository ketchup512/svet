package com.company.zive_tvory;

import java.util.Date;
public abstract class Tvor implements bornable, dieable{
    protected int x;
    protected int y;
    protected int z;

    public Date getDay_of_birth() {
        return day_of_birth;
    }

    protected Date day_of_birth;

    protected Date day_of_die;
    public abstract void hybsa(int direction_x, int direction_y, int direction_z);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }


    public void setZ(int z) {
        this.z = z;
    }
}
