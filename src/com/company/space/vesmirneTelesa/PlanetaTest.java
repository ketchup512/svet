package com.company.space.vesmirneTelesa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetaTest {

    @Test
    void getVaha() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        assertEquals(123, Zem.getVaha());
    }

    @Test
    void getPriemer() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        assertEquals(123, Zem.getPriemer());
    }

    @Test
    void getName() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        assertEquals("Zem", Zem.getName());
    }

    @Test
    void getGravitacia() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        assertEquals(9.81, Zem.getGravitacia());
    }


    @Test
    void setPriemer() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        Zem.setPriemer(125);
        assertEquals(125, Zem.getPriemer());
    }

    @Test
    void setName() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        Zem.setName("Zem2");
        assertEquals("Zem2", Zem.getName());
    }

    @Test
    void increaseGravity() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        Zem.increaseGravity(2);
        assertEquals(11.81, Zem.getGravitacia());
    }

    @Test
    void decreaseGravity() {
        Planeta Zem = new Planeta("Zem", 123,  123);
        Zem.decreaseGravity(2);
        assertEquals((9.81-2), Zem.getGravitacia());
    }
}