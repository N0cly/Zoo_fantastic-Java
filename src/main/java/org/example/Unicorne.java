package org.example;

public class Unicorne extends Creature implements Run, Viviparous {

    public Unicorne(String name, Boolean type, int weight, int height, int age, int health, String cries) {
        super(name, type, weight, height, age, health, cries);
    }

}