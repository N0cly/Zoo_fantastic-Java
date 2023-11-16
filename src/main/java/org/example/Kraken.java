package org.example;

public class Kraken extends creature implements swim{

    public Kraken(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

    @Override
    public String swim() {
        return Kraken.super.getName() + " est en train de nager";
    }
}
