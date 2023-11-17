package org.example;

public class Mermaids extends creature implements swim {

    public Mermaids(String name, Boolean type, int weight, int height, int age, int hunger, boolean sleeping,
            int health, String cries) {
        super(name, type, weight, height, age, health, cries);
    }

}
