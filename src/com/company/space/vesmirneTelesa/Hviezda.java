package com.company.space.vesmirneTelesa;

public class Hviezda extends  VesmirneTelesa{
    private long farbaSvetla;
    private double teplota;
    private double priemer;
    private String name;
    private Boolean svetlo = true;
    public Hviezda(long farbaSvetla, double teplota, double priemer) {
        setPriemer(priemer);
        setFarbaSvetla(farbaSvetla);
        setTeplota(teplota);
    }
    public Hviezda(String name){
        setName(name);
        setTeplota(400);
        setFarbaSvetla(1);
        setPriemer(1520);
    }
    public void sviet (){
        svetlo = true;
        setTeplota(getTeplota()+20);
    }
    public void zhasni(){
        svetlo = false;
        while(getTeplota()>0){
            setTeplota(getTeplota()-20);
        }
    }
    public double getPriemer() {
        return priemer;
    }

    public double getTeplota() {
        return teplota;
    }

    public long getFarbaSvetla() {
        return farbaSvetla;
    }

    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }

    public void setTeplota(double teplota) {
        this.teplota = teplota;
    }

    public void setFarbaSvetla(long farbaSvetla) {
        this.farbaSvetla = farbaSvetla;
    }

    public void setPriemer(double priemer) {
        this.priemer = priemer;
    }
}
