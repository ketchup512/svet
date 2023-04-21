package com.company.space.vesmirneTelesa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KometaTest {

    @Test
    void getName() {

        Kometa kometka = new Kometa("Kometa");
        assertEquals("Kometa", kometka.getName());
    }
}