package com.company.space;
import com.company.space.vesmirneTelesa.Hviezda;
import com.company.space.vesmirneTelesa.Planeta;
import com.company.space.vesmirneTelesa.Slnecna_sustava;

public class Galaxia {
    private Slnecna_sustava[] sustavy= new Slnecna_sustava[500000000];
    private int object_counter;
    private String name;
    public static String sprava = "there no is no messages";
    public Galaxia(String name) {
        this.name = name;
        setObject_counter(0);
    }

    public void addSustava(Slnecna_sustava sustava){
        sustavy[object_counter] = sustava;
        setObject_counter(1+object_counter);
        addsprava();
    }

    public static String getSprava() {
        return sprava;
    }

    public void addsprava(){
        if(object_counter > 1){
            sprava = "IN Galaxy " + name + "more than 1 objects";
        }
        else{
            sprava = "IN Galaxy " + name + " more than 0 objects";
        }
    }
    private void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }
}
