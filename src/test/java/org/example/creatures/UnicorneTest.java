package org.example.creatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnicorneTest {

    @Test
    void displayCharacteristics(){
        Unicorne unicorne = new Unicorne("Unicorne", "Femelle", 100, 100, 100, 100, "Hiiiiii");
        assertEquals("Unicorne", unicorne.getName());
        assertEquals("Femelle", unicorne.getGender());
        assertEquals(100, unicorne.getWeight());
        assertEquals(100, unicorne.getHeight());
        assertEquals(100, unicorne.getAge());
        assertEquals(100, unicorne.getHealth());
        assertEquals("Hiiiiii", unicorne.getCries());
        assertEquals("Unicorne", unicorne.getSpecies());
    }

}