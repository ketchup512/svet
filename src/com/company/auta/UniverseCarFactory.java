package com.company.auta;

public class UniverseCarFactory {
    protected String FabricName;

    public UniverseCarFactory(String fabricName) {
        FabricName = fabricName;
    }

    public Auto produce(String type){
        if(type == "SUV"){
            Auto suvko = new SUV();
            suvko.setZnacka(FabricName);
            suvko.setModel("Suviaq");
            return suvko;
        }
        else if(type == "MPV"){
            Auto mpvcko =new MPV();
            mpvcko.setZnacka(FabricName);
            mpvcko.setModel("Familiaq");
            return mpvcko;
        }
        else if(type == "SportAuto"){
            Auto sport =new SportAuto();
            sport.setZnacka(FabricName);
            sport.setModel("Sportove");
            return sport;
        }
        else if(type == "MiniAuto"){
            Auto minik =new MiniAuto();
            minik.setZnacka(FabricName);
            minik.setModel("MiniCooper");
            return minik;
        }
        return null;
    }
}
