package org.example;

import org.example.creatures.Phenix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhenixTest {

    @Test
    void fly() {
Phenix phenix = new Phenix("Phenix", "Male", 10, 10, 10, 10, "Crie");
        assertEquals("Phenix est en train de voler", phenix.fly(phenix));
    }

    @Test
    void oviparous() {
        Phenix phenix = new Phenix("Phenix", "Male", 10, 10, 10, 10, "Crie");
        assertEquals("Phenix pond des oeufs", phenix.oviparous(phenix));
    }

}