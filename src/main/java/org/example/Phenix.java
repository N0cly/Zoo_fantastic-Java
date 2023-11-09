package org.example;

public class Phenix extends creature implements fly{

    public Phenix(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

    public String fly() {
        if (isAlive()) {
            return Phenix.super.getName() + " est en train de voler";
        } else {
            return Phenix.super.getName() + " est mort";
        }
    }
}
