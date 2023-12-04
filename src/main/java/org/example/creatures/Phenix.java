package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

public class Phenix extends Creature implements Fly, Oviparous, FlyingCreature {

    public Phenix(String name, String species, Boolean type, int weight, int height, int age, int hunger, boolean sleeping, int health,
            String cries) {
        super(name, species, type, weight, height, age, health, cries);
    }

    @Override
    public void fly() {
        System.out.println("Le Phenix s'élève dans les airs.");
    }
}
