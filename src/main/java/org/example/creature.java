package org.example;

public class creature {

    //Class for creature

    private String name;
    private String type;
    private int weight;
    private int height;
    private int age;
    private int hunger;
    private boolean sleeping;
    private int health;

    private String cries;
    private boolean isAlive = true;


    public creature(String name, String type, int weight, int height, int age, int hunger, boolean sleeping, int health, String cries) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.hunger = hunger;
        this.sleeping = sleeping;
        this.health = health;
        this.cries = cries;
    }


    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getHunger() {
        return hunger;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public int getHealth() {
        return health;
    }

    public String getCries() {
        return cries;
    }

    public void eat() {
        if (isAlive){
            if (hunger < 100 && sleeping == false) {
                hunger = hunger + 10;
                System.out.println("You fed " + name + " and their hunger is now " + hunger);
            } else {
                System.out.println("You can't feed " + name + " right now");
            }
        } else {
            System.out.println(name + " is dead");
        }

    }

    public void heal(){
        if (isAlive){
            if (health < 100) {
                health = health + 10;
                System.out.println("You healed " + name + " and their health is now " + health);
            } else {
                System.out.println("You can't heal " + name + " right now");
            }
        } else {
            System.out.println(name + " is dead");
        }

    }

    public void sleep() {

        if (isAlive){
            if (sleeping == false) {
                sleeping = true;
                System.out.println(name + " is now sleeping");
            } else {
                System.out.println(name + " is already sleeping");
            }
        } else {
            System.out.println(name + " is dead");
        }

    }

    public void wake() {
        if (isAlive){
            if (sleeping == true) {
                sleeping = false;
                System.out.println(name + " is now awake");
            } else {
                System.out.println(name + " is already awake");
            }
        } else {
            System.out.println(name + " is dead");
        }

    }

    public void old() {
        if (isAlive){
            if (age < 100) {
                age = age + 1;
                System.out.println(name + " is now " + age + " years old");
            } else if (age == 100 || health == 0) {
                System.out.println(name + " is now dead");
            } else {
                System.out.println(name + " is already dead");
            }
        } else {
            System.out.println(name + " is dead");
        }

    }

}
