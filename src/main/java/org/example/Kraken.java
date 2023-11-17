package org.example;

public class Kraken extends Creature implements Swim, Oviparous{

    public Kraken(String name, Boolean type, int weight, int height, int age, int health,
            String cries) {
        super(name, type, weight, height, age, health, cries);
    }

}
