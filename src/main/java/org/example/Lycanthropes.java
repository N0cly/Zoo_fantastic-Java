package org.example;

public class Lycanthropes extends creature implements run{

    public Lycanthropes(String name, Boolean type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        super(name, type, weight, height, age, hunger, sleeping, health, cries);
    }

}
