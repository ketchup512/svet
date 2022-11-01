package com.company.space;
import com.company.space.vesmirneTelesa.Hviezda;
import com.company.space.vesmirneTelesa.Planeta;
import com.company.space.vesmirneTelesa.Slnecna_sustava;

public class Galaxia {
    private Slnecna_sustava[] sustavy= new Slnecna_sustava[500000000];
    private int object_counter;
    private String name;
    public Galaxia(String name) {
        this.name = name;
        setObject_counter(0);
    }

    public void addSustava(Slnecna_sustava sustava){
        sustavy[object_counter] = sustava;
        setObject_counter(1+object_counter);
    }

    private void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }
}
