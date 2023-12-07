package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

public class Phenix extends Creature implements Fly, Oviparous, FlyingCreature {

    public Phenix(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name,gender, weight, height, age, health, cries);
        this.setSpecies("Phenix");
    }

    @Override
    public String fly() {
        System.out.println("Le Phenix s'élève dans les airs.");
        return "Le Phenix s'élève dans les airs.";
    }
}
