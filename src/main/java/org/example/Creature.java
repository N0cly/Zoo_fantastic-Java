package org.example;

/**
 * Represents a creature in a zoo.
 */
public class Creature implements Runnable {

    // Properties
    private String name;
    private String species;
    private String gender;
    private int weight;
    private int height;
    protected int age;
    private double hunger;
    private boolean sleeping;
    private int health;

    private String cries;
    private boolean isAlive;

    /**
     * Constructor for the Creature class.
     *
     * @param name    The name of the creature.
     * @param gender  The gender of the creature.
     * @param weight  The weight of the creature.
     * @param height  The height of the creature.
     * @param age     The age of the creature.
     * @param health  The health of the creature.
     * @param cries   The sound the creature makes.
     */
    public Creature(String name, String gender, int weight, int height, int age, int health, String cries) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.health = health;
        this.cries = cries;
        this.hunger = 100;
        this.sleeping = false;
        this.isAlive = true;
    }

    /**
     * Runnable interface method. Initiates the hunger behavior in a separate thread.
     */
    @Override
    public void run() {
        hunger();
    }

    /**
     * Simulates hunger behavior. Decreases hunger over time and handles starvation.
     */
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
                // Handle interruption if necessary
                Thread.currentThread().interrupt(); // Restore the interruption status
            }
        }
    }

    // Getter and setter methods (omitted for brevity)

    /**
     * Action: Feed the creature. Increases hunger if alive, not sleeping, and hunger is less than 100.
     */
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

    /**
     * Action: Heal the creature. Increases health if alive and health is less than 100.
     */
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

    /**
     * Action: Make the creature sleep. Sets sleeping to true if alive and not already sleeping.
     */
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

    /**
     * Action: Wake the creature. Sets sleeping to false if alive and currently sleeping.
     */
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

    /**
     * Action: Age the creature. Increases age if alive and age is less than 100.
     * If age reaches 100 or health reaches 0, the creature dies.
     */
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

    /**
     * String representation of the creature.
     *
     * @return A string containing the name, species, and age of the creature.
     */
    @Override
    public String toString() {
        return "Créature{" +
                "nom='" + name + '\'' +
                ", espèce='" + species + '\'' +
                ", âge=" + age +
                '}';
    }

    /**
     * Protected method to display additional information. Currently empty.
     */
    protected void displayInfo() {
        // Additional information can be displayed here in subclasses
    }
}
