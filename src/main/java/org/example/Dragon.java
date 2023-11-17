package org.example;

public class Dragon extends Creature implements Runnable, Run, Swim, Fly, Oviparous {

    public Dragon(String name, Boolean type, int weight, int height, int age, int health,
            String cries) {
        super(name, type, weight, height, age, health, cries);
    }

    public void run() {
        Thread hunger = new Thread(hunger());
        hunger.start();
    }
}
