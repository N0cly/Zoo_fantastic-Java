package org.example;

import org.example.creatures.Dragon;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {



    @org.junit.jupiter.api.Test
    void flydied() {
        assertEquals("Dragon est mort", dragon.fly(dragon));
    }

    @org.junit.jupiter.api.Test
    void swim() {
        assertEquals("Dragon est en train de nager", dragon.swim(dragon));
    }

    @org.junit.jupiter.api.Test
    void run() {
        assertEquals("Dragon est en train de courir", dragon.run(dragon));
    }
}