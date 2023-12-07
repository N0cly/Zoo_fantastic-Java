package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

public class Kraken extends Creature implements Swim, Oviparous, AquaticCreature {

    public Kraken(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name,gender, weight, height, age, health, cries);
        this.setSpecies("Kraken");
    }

    @Override
    public String swim() {
        System.out.println("Le Kraken se déplace puissamment dans l'eau.");
        return "Le Kraken se déplace puissamment dans l'eau.";
    }

}
