package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

public class Megalodons extends Creature implements Swim, Oviparous, AquaticCreature {

    public Megalodons(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name,gender, weight, height, age, health, cries);
        this.setSpecies("Megalodons");
    }

    @Override
    public void swim() {
        System.out.println("Le Megalodon se déplace puissamment dans l'eau.");
    }
}
