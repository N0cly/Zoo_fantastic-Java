package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

public class Dragon extends Creature implements Run, Swim, Fly, Oviparous, FlyingCreature, AquaticCreature {

    public Dragon(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name,gender, weight, height, age, health, cries);
        this.setSpecies("Dragon");
    }

    @Override
    public String fly() {
        System.out.println("Le Dragon s'envole dans les airs.");
        return "Le Dragon s'envole dans les airs.";
    }

    @Override
    public String swim() {
        System.out.println("Le Dragon se déplace dans l'eau.");
        return null;
    }
}
