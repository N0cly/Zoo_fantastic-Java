package org.example;

public class Phenix extends Creature implements Fly, Oviparous {

    public Phenix(String name, Boolean type, int weight, int height, int age, int hunger, boolean sleeping, int health,
            String cries) {
        super(name, type, weight, height, age, health, cries);
    }

}
