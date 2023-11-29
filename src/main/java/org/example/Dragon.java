package org.example;

public class Dragon extends Creature implements Run, Swim, Fly, Oviparous, FlyingCreature, AquaticCreature {

    public Dragon(String name, String species, Boolean type, int weight, int height, int age, int health,
            String cries) {
        super(name, species, type, weight, height, age, health, cries);
    }

    @Override
    public void fly() {
        System.out.println("Le Dragon s'envole dans les airs.");
    }

    @Override
    public void swim() {
        System.out.println("Le Dragon se déplace dans l'eau.");
    }
}
