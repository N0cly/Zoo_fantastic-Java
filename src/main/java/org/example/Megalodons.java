package org.example;

public class Megalodons extends Creature implements Swim, Oviparous, AquaticCreature{

    public Megalodons(String name, String species, Boolean type, int weight, int height, int age, int health, String cries) {
        super(name, species, type, weight, height, age, health, cries);
    }

    @Override
    public void swim() {
        System.out.println("Le Megalodon se déplace puissamment dans l'eau.");
    }
}
