package org.example;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @org.junit.jupiter.api.Test
    void fly() {
        Dragon dragon = new Dragon("Dragon", true, 10, 10, 10, 10, "cries");
        assertEquals("Dragon est en train de voler", dragon.fly(dragon.getName(), dragon.isAlive()));

    }

    @org.junit.jupiter.api.Test
    void flydied()  {
        Dragon dragon = new Dragon("Dragon", true, 10, 10, 10, 10, "cries");
        assertEquals("Dragon est mort", dragon.fly("Dragon", false));
    }

    @org.junit.jupiter.api.Test
    void swim() {
        Dragon dragon = new Dragon("Dragon", true, 10, 10, 10, 10, "cries");
        assertEquals("Dragon est en train de nager", dragon.swim("Dragon", true));
    }

    @org.junit.jupiter.api.Test
    void run() {
        Dragon dragon = new Dragon("Dragon", true, 10, 10, 10, 10, "cries");
        assertEquals("Dragon est en train de courir", dragon.run("Dragon", true));
    }
}