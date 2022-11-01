package com.company.space.vesmirneTelesa;

public class Slnecna_sustava {
    private Hviezda Slnko;
    private Planeta Zem;
    private Planeta Mars;
    private Planeta Jupiter;
    private Planeta Saturn;

    private VesmirneTelesa[] obezne_telesa= new VesmirneTelesa[500000000];

    private int object_counter;

    public Slnecna_sustava() {
        Slnko = new Hviezda("Slnko");
        setObject_counter(0);
        obezne_telesa[object_counter]=new Planeta("Mars",432432,432432);
        setObject_counter(1+object_counter);
        obezne_telesa[object_counter]= new Planeta("Venusa", 55555,32342);
        setObject_counter(1+object_counter);
        obezne_telesa[object_counter]= new Planeta("Zem", 55555,32342);
        setObject_counter(1+object_counter);
        obezne_telesa[object_counter]= new Planeta("Jupiter", 55555,32342);
        setObject_counter(1+object_counter);
        obezne_telesa[object_counter]= new Planeta("Saturn", 55555,32342);
        setObject_counter(1+object_counter);
        obezne_telesa[object_counter]= new Hviezda("polarka");
        setObject_counter(1+object_counter);
        obezne_telesa[object_counter]= new Kometa("IMCOMET");
        setObject_counter(1+object_counter);

    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }

    public void addTeleso(VesmirneTelesa nove_teleso)
    {
        obezne_telesa[object_counter]=nove_teleso;
        object_counter++;
    }

}
