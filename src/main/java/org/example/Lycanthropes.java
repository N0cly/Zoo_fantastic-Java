package org.example;

public class Lycanthropes extends creature implements run{

    public Lycanthropes(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

    @Override
    public String run() {
        if (isAlive()) {
            return Lycanthropes.super.getName() + " est en train de courir";
        } else {
            return Lycanthropes.super.getName() + " est mort";
        }
    }
}
