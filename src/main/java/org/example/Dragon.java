package org.example;

public class Dragon extends Creature implements Run, Swim, Fly, Oviparous {

    public Dragon(String name, Boolean type, int weight, int height, int age, int health,
            String cries) {
        super(name, type, weight, height, age, health, cries);
    }


}
