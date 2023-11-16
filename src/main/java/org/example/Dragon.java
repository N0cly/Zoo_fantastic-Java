package org.example;

public class Dragon extends creature implements run, swim, fly{

    public Dragon(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

    @Override
    public String run() {
        if (isAlive()) {
            return Dragon.super.getName() + " est en train de courir";
        } else {
            return Dragon.super.getName() + " est mort";
        }
    }

    @Override
    public String swim() {
        if (isAlive()) {
            return Dragon.super.getName() + " est en train de nager";
        } else {
            return Dragon.super.getName() + " est mort";
        }
    }

    @Override
    public String fly() {
        if (isAlive()) {
            return Dragon.super.getName() + " est en train de voler";
        } else {
            return Dragon.super.getName() + " est mort";
        }
    }
}
