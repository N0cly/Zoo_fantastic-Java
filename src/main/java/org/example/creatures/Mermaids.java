package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;
public class Mermaids extends Creature implements Swim, Viviparous, AquaticCreature {

    public Mermaids(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name,gender, weight, height, age, health, cries);
        this.setSpecies("Mermaids");
    }

    @Override
    public String swim() {
        System.out.println("La sirène nage dans l'eau.");
        return "La sirène nage dans l'eau.";
    }

}