package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.cicavce.Cicavec;
import com.company.zive_tvory.cicavce.Materske_mlieko;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.*;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.rozmnozovaciaClovek.Rozmnozovacia_sustava_zena;

import java.util.Date;
import java.util.Random;

public class Zena extends Clovek{

    public Zena(Clovek mama, Clovek otec, int pocet_stavcov) {
        super(mama, otec, pocet_stavcov);
    }

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

    @Override
    public void create_sustavy() {
        sustavy[0] = new Obehova_sustava_stavovec(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Oporna_sustava_stavovec(Typ_sustavy.OPORNA);
        sustavy[2] = new Vylucovacia_sustava_stavovec(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Pohybova_sustava_stavovec(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Dychacia_sustava_stavovec(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Travacia_sustava_stavovec(Typ_sustavy.TRAVACIA);
        sustavy[6] = new Rozmnozovacia_sustava_zena(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Nervova_sustava_stavovec_default(Typ_sustavy.NERVOVA);

        System.out.println("Ta zena som, vdaka Bohu mam taketo problemy");
    }

    public Clovek splodit(Muz buduciOtec){
        Random rand = new Random();
        Boolean man = rand.nextBoolean();

        Clovek cloveciekSplodeny;

        if(man){
            cloveciekSplodeny = new Muz(buduciOtec, this, 34);
            super.deti.add(cloveciekSplodeny);
            buduciOtec.deti.add(cloveciekSplodeny);
        }
        else{
            cloveciekSplodeny = new Zena(buduciOtec, this, 34);
            super.deti.add(cloveciekSplodeny);
            buduciOtec.deti.add(cloveciekSplodeny);
        }
        cloveciekSplodeny.priezvisko= super.priezvisko+ "-"+ buduciOtec.priezvisko;
        babyInsideCare(cloveciekSplodeny);
        return cloveciekSplodeny;
    }

    public void babyInsideCare(Clovek plod){
        Rozmnozovacia_sustava_zena rsm = (Rozmnozovacia_sustava_zena) sustavy[6];
        rsm.takeAndCareBaby(plod);
    }
}
