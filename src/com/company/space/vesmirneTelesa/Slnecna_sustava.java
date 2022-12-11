package com.company.space.vesmirneTelesa;

import java.util.HashSet;
import java.util.Set;

public class Slnecna_sustava {
    private Hviezda Slnko;
    private Planeta Zem;
    private Planeta Mars;
    private Planeta Jupiter;
    private Planeta Saturn;

    private Set<VesmirneTelesa> obezne_telesa = new HashSet<VesmirneTelesa>();
  //  private int object_counter;

    public Slnecna_sustava() {
        Slnko = new Hviezda("Slnko");
        //setObject_counter(0);
        obezne_telesa.add(new Planeta("Mars",432432,432432));
        //setObject_counter(1+object_counter);
        obezne_telesa.add(new Planeta("Venusa", 55555,32342));
        //setObject_counter(1+object_counter);
        obezne_telesa.add(new Planeta("Zem", 55555,32342));
       // setObject_counter(1+object_counter);
        obezne_telesa.add(new Planeta("Jupiter", 55555,32342));
       // setObject_counter(1+object_counter);
        obezne_telesa.add(new Planeta("Saturn", 55555,32342));

        obezne_telesa.add(new Hviezda("polarka"));

        obezne_telesa.add(new Kometa("IMCOMET"));


    }

    //public void setObject_counter(int object_counter) {
    //    this.object_counter = object_counter;
    //}

    public void addTeleso(VesmirneTelesa nove_teleso)
    {
        obezne_telesa.add(nove_teleso);
    }

}
