package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;
public class Unicorne extends Creature implements Run, Viviparous {

    public Unicorne(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name,gender, weight, height, age, health, cries);
        this.setSpecies("Unicorne");
    }

}