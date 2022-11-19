package com.company.zive_tvory.clovecina;

import com.company.zive_tvory.cicavce.Cicavec;

import java.util.ArrayList;
import java.util.List;

public abstract class Clovek extends Cicavec {

   protected Clovek otec;
   protected Clovek matka;
   protected List<Clovek> deti;

   protected String meno, priezvisko;

    @Override
    public String toString() {
        return "Clovek{" +
                "Meno='" + meno + '\'' +
                ", Priezvisko='" + priezvisko + '\'' +
                '}';
    }

    public Clovek(Clovek mama, Clovek otec, int pocet_stavcov){
       super(pocet_stavcov);

       this.matka = mama;
       this.otec = otec;

       deti = new ArrayList();
   }

}
