package org.example.creatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnicornTest {

    @Test
    void displayCharacteristics(){
        Unicorn unicorn = new Unicorn("Unicorne", "Femelle", 100, 100, 100, 100, "Hiiiiii");
        assertEquals("Unicorne", unicorn.getName());
        assertEquals("Femelle", unicorn.getGender());
        assertEquals(100, unicorn.getWeight());
        assertEquals(100, unicorn.getHeight());
        assertEquals(100, unicorn.getAge());
        assertEquals(100, unicorn.getHealth());
        assertEquals("Hiiiiii", unicorn.getCries());
        assertEquals("Unicorne", unicorn.getSpecies());
    }

}