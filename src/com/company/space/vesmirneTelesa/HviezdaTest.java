package com.company.space.vesmirneTelesa;

import com.company.space.Galaxia;

import static org.junit.jupiter.api.Assertions.*;

class HviezdaTest {

    @org.junit.jupiter.api.Test
    void getPriemer() {
        Hviezda Slnko = new Hviezda("Slnko");
        assertEquals(1520, Slnko.getPriemer());
    }

    @org.junit.jupiter.api.Test
    void getTeplota() {
        Hviezda Slnko = new Hviezda("Slnko");
        assertEquals(400, Slnko.getTeplota());

    }

    @org.junit.jupiter.api.Test
    void getName() {
        Hviezda Slnko = new Hviezda("Slnko");
        assertEquals("Slnko", Slnko.getName());
    }

    @org.junit.jupiter.api.Test
    void setTeplota() {
        Hviezda Slnko = new Hviezda("Slnko");
        Slnko.setTeplota(512512);
        assertEquals(512512, Slnko.getTeplota());
    }

    @org.junit.jupiter.api.Test
    void setFarbaSvetla() {
        Hviezda Slnko = new Hviezda("Slnko");
        Slnko.setTeplota(500);
        assertEquals(500, Slnko.getTeplota());
    }

    @org.junit.jupiter.api.Test
    void setPriemer() {
        Hviezda Slnko = new Hviezda("Slnko");
        Slnko.setPriemer(512512);
        assertEquals(512512, Slnko.getPriemer());
    }
}