package org.example;

public class Creature implements Runnable {

    // Class for creature

    private String name;
    private String species;
    private Boolean type;
    private int weight;
    private int height;
    protected int age;
    private double hunger;
    private boolean sleeping;
    private int health;

    private String cries;
    private boolean isAlive;

    public Creature(String name, String species2, Boolean type, int weight, int height, int age, int health,
            String cries) {
        this.name = name;
        this.species = "Dragon";
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.health = health;
        this.cries = cries;
        this.hunger = 100;
        this.sleeping = false;
        this.isAlive = true;
    }

    @Override
    public void run() {
        hunger();
    }

    public void hunger() {
        while (this.hunger > 0 && !Thread.interrupted()) {
            try {
                this.hunger = this.hunger - 1;
                Thread.sleep(1000);

                if (this.hunger <= 15) {
                    System.out.println("Il est temps de manger pour " + this.name + " (" + this.hunger + " )");

                    Thread.sleep(1000);

                    if (this.hunger == 0) {
                        System.out.println(this.name + " est mort de famine.");
                        this.isAlive = false;
                        break;
                    }
                }
            } catch (InterruptedException e) {
                // Gérer l'interruption si nécessaire
                Thread.currentThread().interrupt(); // Rétablir le statut d'interruption
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setCries(String cries) {
        this.cries = cries;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public Boolean getType() {
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

    public double getHunger() {
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
        if (isAlive) {
            if (hunger < 100 && !sleeping) {
                hunger = hunger + 10;
                System.out.println("You fed " + name + " and their hunger is now " + hunger);
            } else {
                System.out.println("You can't feed " + name + " right now");
            }
        } else {
            System.out.println(name + " is dead");
        }

    }

    public void heal() {
        if (isAlive) {
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

        if (isAlive) {
            if (!sleeping) {
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
        if (isAlive) {
            if (sleeping) {
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
        if (isAlive) {
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

    @Override
    public String toString() {
        return "Créature{" +
                "nom='" + name + '\'' +
                ", espèce='" + species + '\'' +
                ", âge=" + age +
                '}';
    }

}
