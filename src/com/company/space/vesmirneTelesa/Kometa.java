package com.company.space.vesmirneTelesa;

public class Kometa extends VesmirneTelesa{

    String name;

    public Kometa(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
