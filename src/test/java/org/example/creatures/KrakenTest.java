package org.example.creatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KrakenTest {

    // generate test for Kraken class

    @Test
    void displayCharacteristics(){
        Kraken kraken = new Kraken("Kraken", "Femelle", 100, 100, 100, 100, "Grrrrr");
        assertEquals("Kraken", kraken.getName());
        assertEquals("Femelle", kraken.getGender());
        assertEquals(100, kraken.getWeight());
        assertEquals(100, kraken.getHeight());
        assertEquals(100, kraken.getAge());
        assertEquals(100, kraken.getHealth());
        assertEquals("Grrrrr", kraken.getCries());
        assertEquals("Kraken", kraken.getSpecies());
    }

    @Test
    void swim() {
        Kraken kraken = new Kraken("Kraken", "Femelle", 100, 100, 100, 100, "Grrrrr");
        assertEquals("Le Kraken se déplace puissamment dans l'eau.", kraken.swim());
    }

}