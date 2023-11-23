package org.example;

public class Mermaids extends Creature implements Swim, Viviparous, AquaticCreature {

    public Mermaids(String name, String species, Boolean type, int weight, int height, int age, int health, String cries) {
        super(name, species,type, weight, height, age, health, cries);
    }

    @Override
    public void swim() {
        System.out.println("La sirène nage dans l'eau.");
    }

}
