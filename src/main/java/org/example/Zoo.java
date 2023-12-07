package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a zoo that contains enclosures and creatures.
 */
public class Zoo {

    private String name;
    private ZooKeeper zooKeeper;
    private int maxEnclosures;
    private List<Enclosure> enclosures;

    /**
     * Constructs a zoo with the specified name and maximum number of enclosures.
     *
     * @param name           The name of the zoo.
     * @param maxEnclosures The maximum number of enclosures in the zoo.
     */
    public Zoo(String name, int maxEnclosures) {
        this.name = name;
        this.zooKeeper = null;
        this.maxEnclosures = maxEnclosures;
        this.enclosures = new ArrayList<>();
    }

    /**
     * Displays the total number of creatures in the zoo.
     */
    public void displayTotalNumberOfCreatures() {
        int total = 0;
        for (Enclosure enclosure : enclosures) {
            total += enclosure.getNumberOfCreatures();
        }
        System.out.println("Nombre total de créatures dans le zoo: " + total);
    }

    /**
     * Displays the creatures in all enclosures of the zoo.
     */
    public void displayCreaturesInAllEnclosures() {
        for (Enclosure enclosure : enclosures) {
            System.out.println("Enclos: " + enclosure.getName());
            enclosure.displayInfo();
        }
    }

    /**
     * Applies random events to the creatures and enclosures in the zoo.
     */
    public void applyRandomEvents() {
        Random random = new Random();
        for (Enclosure enclosure : enclosures) {
            for (Creature creature : enclosure.getCreatures()) {
                // Randomly put creatures to sleep or wake them up
                if (random.nextBoolean()) {
                    creature.sleep();
                } else {
                    creature.wake();
                }

                // Randomly modify creature's health
                if (random.nextBoolean()) {
                    creature.heal();
                }

                // Randomly feed the creature
                if (random.nextBoolean()) {
                    creature.eat();
                }

                // Randomly age the creature
                if (random.nextBoolean()) {
                    creature.old();
                }
            }

            // Randomly modify the cleanliness state of the enclosure
            if (random.nextBoolean()) {
                enclosure.setCleanliness(Cleanliness.values()[random.nextInt(Cleanliness.values().length)]);
            }
        }
    }

    public String getName() {
        return this.name;
    }
}
