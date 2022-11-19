package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.cicavce.Cicavec;
import com.company.zive_tvory.cicavce.Materske_mlieko;

import java.util.Date;

public class Zena extends Clovek{
    public Zena(Clovek mama, Clovek otec, int pocet_stavcov, String meno, String priezvisko){
        super(mama, otec, pocet_stavcov);
        super.meno = meno;
        super.priezvisko = priezvisko;

        create_sustavy();
    }

    @Override
    public void cicat(Cicavec mama) {

    }

    @Override
    public void cicat(Materske_mlieko mliecko) {

    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        super.hybsa(direction_x, direction_y, direction_z);
    }

    @Override
    public void born(Date day_of_birth) {
        super.born(day_of_birth);
    }

    @Override
    public void die(Date day_of_die) {
        super.die(day_of_die);
    }
}
