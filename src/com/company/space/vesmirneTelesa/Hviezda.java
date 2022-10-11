package com.company.space.vesmirneTelesa;

public class Hviezda {
    private long farbaSvetla;
    private double teplota;
    private double priemer;

    public Hviezda(long farbaSvetla, double teplota, double priemer) {
        setPriemer(priemer);
        setFarbaSvetla(farbaSvetla);
        setTeplota(teplota);
    }
    public Hviezda(){
        setTeplota(400);
        setFarbaSvetla(1);
        setPriemer(1520);
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
