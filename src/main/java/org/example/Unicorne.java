package org.example;

public class Unicorne extends Creature implements Run, Viviparous {

    public Unicorne(String name, String species, Boolean type, int weight, int height, int age, int health, String cries) {
        super(name, species, type, weight, height, age, health, cries);
    }

}