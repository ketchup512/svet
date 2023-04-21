package com.company.space;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GalaxiaTest {

    @Test
    void getSprava() {
        Galaxia galaxy = new Galaxia("GALAXY");
        assertEquals("there no is no messages", Galaxia.getSprava());
    }

    @Test
    void addsprava() {
        Galaxia galaxy = new Galaxia("GALAXY");
        galaxy.addsprava();
        assertEquals("IN Galaxy GALAXY more than 0 objects", Galaxia.getSprava());
    }
}