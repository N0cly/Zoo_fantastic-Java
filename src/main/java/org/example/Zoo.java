package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Represents a zoo that contains enclosureList and creatures.
 */
public class Zoo {

    public String name;
    private ZooKeeper zooKeeper;
    private int maxEnclosures;
    private List<Enclosure> enclosureList;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Constructs a zoo with the specified name and maximum number of enclosures.
     *
     * @param name          The name of the zoo.
     * @param maxEnclosures The maximum number of enclosures in the zoo.
     */
    public Zoo(String name, int maxEnclosures, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.maxEnclosures = maxEnclosures;
        this.enclosureList = new ArrayList<>();
    }

    /**
     * Displays the total number of creatures in the zoo.
     */
    public void displayTotalNumberOfCreatures() {
        int total = 0;
        for (Enclosure enclosure : enclosureList) {
            total += enclosure.getNumberOfCreatures();
        }
        System.out.println("Nombre total de créatures dans le zoo: " + total);
    }

    /**
     * Displays the creatures in all enclosureList of the zoo.
     */
    public void displayCreaturesInAllenclosureList() {
        for (Enclosure enclosure : enclosureList) {
            System.out.println("Enclos: " + enclosure.getName());
            enclosure.displayInfo();
        }
    }

    /**
     * Applies random events to the creatures and enclosureList in the zoo.
     */
    public void applyRandomEvents() {
        Random random = new Random();
        for (Enclosure enclosure : enclosureList) {
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
        return name;
    }
}
