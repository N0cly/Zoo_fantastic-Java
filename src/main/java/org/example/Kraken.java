package org.example;

public class Kraken extends Creature implements Swim, Oviparous, AquaticCreature{

    public Kraken(String name, String species, Boolean type, int weight, int height, int age, int health,
            String cries) {
        super(name, species, type, weight, height, age, health, cries);
    }

    @Override
    public void swim() {
        System.out.println("Le Kraken se déplace puissamment dans l'eau.");
    }

}
