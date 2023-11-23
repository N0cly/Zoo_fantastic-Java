package org.example;

public class Lycanthropes extends Creature implements Run, Viviparous {

    public Lycanthropes(String name, String species, Boolean type, int weight, int height, int age, int health, String cries) {
        super(name, species,type, weight, height, age, health, cries);
    }

}
