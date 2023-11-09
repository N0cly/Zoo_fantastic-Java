package org.example;

public class Megalodons extends creature implements swim {

    public Megalodons(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

    public String swim() {
        return Megalodons.super.getName() + " est en train de nager";
    }
}
