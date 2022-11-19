package com.company.zive_tvory.bezstavovce.hmyz;

import com.company.zive_tvory.bezstavovce.Bezstavovce;

import java.util.Date;

public class Hmyz extends Bezstavovce {
    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        setY(direction_y);
        setX(direction_x);
        setZ(direction_z);
        System.out.println("ta neviem vobec naco zijem, co uz");
    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_die) {

    }
}
