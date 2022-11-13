package com.company.zive_tvory;

public abstract class Tvor {
    private int x;
    private int y;
    private int z;

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
