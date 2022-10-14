package com.company.space.vesmirneTelesa;

public class Planeta extends  VesmirneTelesa{

    private double vaha, priemer, gravitacia;
    private String name;
    public Boolean weightSet = true;

    public Planeta(){
        setVaha(100000);
        setGravitacia(9.81);
        setName("NewFolder");
        setPriemer(15962);
    }
    public Planeta(String name, double vaha, double priemer, double gravitacia){
        setName(name);
        setVaha(vaha);
        setPriemer(priemer);
        setGravitacia(gravitacia);
    }
    public Planeta(String name, double vaha, double priemer){
        setName(name);
        setVaha(vaha);
        setPriemer(priemer);
        this.gravitacia = 9.81;
    }

    public double getVaha() {
        return vaha;
    }

    public double getPriemer() {
        return priemer;
    }

    public String getName() {
        return name;
    }

    public double getGravitacia() {
        return gravitacia;
    }

    private void setGravitacia(double gravitacia) {
        this.gravitacia = gravitacia;
    }

    public void setVaha(double vaha) {
        if (weightSet == true) {
            if (this.vaha >= vaha && this.vaha - vaha >= 1000) {
                decreaseGravity(0.1);
            } else if (this.vaha < vaha && vaha - this.vaha > 1000) {
                increaseGravity(0.1);
            }
            this.vaha = vaha;
            weightSet = false;
        }

    }
    public void setPlanetaryWeight(double vaha){
        setVaha(getVaha()-200);
    }
    public void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseGravity(double inc) {
        setGravitacia(getGravitacia()+inc);
    }

    public void decreaseGravity(double dec) {
        setGravitacia(getGravitacia()-dec);
    }
}
