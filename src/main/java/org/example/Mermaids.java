package org.example;

public class Mermaids extends creature implements swim{

    public Mermaids(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

    @Override
    public String swim() {
        return Mermaids.super.getName() + " est en train de nager";
    }
}
