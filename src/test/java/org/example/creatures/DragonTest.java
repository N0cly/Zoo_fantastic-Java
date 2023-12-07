package org.example.creatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void fly() {
        // generate test dragon fly
        Dragon dragon = new Dragon("Dragon", "Femelle", 100, 100, 100, 100, "Grrrrr");
        assertEquals("Le Dragon s'envole dans les airs.", dragon.fly());
    }

    @Test
    void swim() {
        // generate test dragon swim
        Dragon dragon = new Dragon("Dragon", "Femelle", 100, 100, 100, 100, "Grrrrr");
        assertEquals("true", dragon.swim());
    }
}