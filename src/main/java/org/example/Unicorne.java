package org.example;

public class Unicorne extends creature implements run {

    public Unicorne(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

    public String run() {
        if (isAlive() == true) {
            return Unicorne.super.getName() + " est en train de courir";
        } else {
            return Unicorne.super.getName() + " est mort";
        }
    }

}