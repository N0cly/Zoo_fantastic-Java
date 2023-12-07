package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents an enclosure in the zoo that houses creatures.
 */
public class Enclosure {

    private String name;
    private double area;
    private int maxCapacity;
    private List<Creature> creatures;
    private static List<Enclosure> enclosureList = new ArrayList<>();
    private Cleanliness cleanliness;

    /**
     * Constructs an enclosure with the specified parameters.
     *
     * @param name        The name of the enclosure.
     * @param area        The area of the enclosure in square meters.
     * @param maxCapacity The maximum capacity of the enclosure.
     * @param cleanliness The cleanliness level of the enclosure.
     */
    public Enclosure(String name, double area, int maxCapacity, Cleanliness cleanliness) {
        this.name = name;
        this.area = area;
        this.maxCapacity = maxCapacity;
        this.creatures = new ArrayList<>();
        this.cleanliness = cleanliness;
        enclosureList.add(this);
    }

    /**
     * Adds a creature to the enclosure if there is space.
     *
     * @param creature The creature to be added to the enclosure.
     */
    public void addCreature(Creature creature) {
        if (creatures.size() < maxCapacity) {
            creatures.add(creature);
        } else {
            System.out.println("L'enclos est plein !");
        }
    }

    public void removeDeadCreatures() {
        Iterator<Creature> iterator = creatures.iterator();
        while (iterator.hasNext()) {
            Creature creature = iterator.next();
            if (!creature.isAlive()) {
                iterator.remove();
                System.out.println(creature.getName() + " a été retiré de l'enclos car il est mort.");
            }
        }
    }

    /**
     * Removes a creature from the enclosure.
     *
     * @param creature The creature to be removed from the enclosure.
     */
    public void removeCreature(Creature creature) {
        creatures.remove(creature);
    }

    /**
     * Displays information about the enclosure, including its name, area, maximum
     * capacity,
     * cleanliness, and the creatures present in the enclosure.
     */
    public void displayInfo() {
        System.out.println("Nom de l'enclos: " + name);
        System.out.println("Superficie: " + area + " mètres carrés");
        System.out.println("Capacité maximale: " + maxCapacity);
        System.out.println("Propreté: " + cleanliness);
        System.out.println("Nombre de créatures: " + getNumberOfCreatures());

        if (!creatures.isEmpty()) {
            System.out.println("Créatures présentes:");
            for (Creature creature : creatures) {
                System.out.println(creature);
            }
        } else {
            System.out.println("Aucune créature présente.");
        }
    }

    /**
     * Performs maintenance on the enclosure by cleaning it if it's empty and not
     * already clean.
     */
    public void maintainEnclosure() {
        if (creatures.isEmpty() && cleanliness != Cleanliness.BON) {
            cleanliness = Cleanliness.BON;
            System.out.println("L'enclos a été nettoyé et est maintenant en bon état.");
        } else {
            System.out.println("L'entretien de l'enclos n'est pas possible actuellement.");
        }
    }

    /**
     * Feeds all creatures in the enclosure.
     */
    public void feedCreatures() {
        if (!creatures.isEmpty()) {
            for (Creature creature : creatures) {
                creature.eat();
            }
        } else {
            System.out.println("Il n'y a pas de créatures à nourrir dans l'enclos " + name);
        }
    }

    /**
     * Gets the number of creatures currently in the enclosure.
     *
     * @return The number of creatures in the enclosure.
     */
    public int getNumberOfCreatures() {
        return creatures.size();
    }

    /**
     * Gets the name of the enclosure.
     *
     * @return The name of the enclosure.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the enclosure.
     *
     * @param name The new name of the enclosure.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the area of the enclosure.
     *
     * @return The area of the enclosure in square meters.
     */
    public double getArea() {
        return area;
    }

    /**
     * Sets the area of the enclosure.
     *
     * @param area The new area of the enclosure in square meters.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Gets the maximum capacity of the enclosure.
     *
     * @return The maximum capacity of the enclosure.
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets the maximum capacity of the enclosure.
     *
     * @param maxCapacity The new maximum capacity of the enclosure.
     */
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * Gets a copy of the list of creatures in the enclosure.
     *
     * @return A list of creatures in the enclosure.
     */
    public List<Creature> getCreatures() {
        return new ArrayList<>(creatures);
    }

    /**
     * Gets the cleanliness level of the enclosure.
     *
     * @return The cleanliness level of the enclosure.
     */
    public Cleanliness getCleanliness() {
        return cleanliness;
    }

    /**
     * Sets the cleanliness level of the enclosure.
     *
     * @param cleanliness The new cleanliness level of the enclosure.
     */
    public void setCleanliness(Cleanliness cleanliness) {
        this.cleanliness = cleanliness;
    }
}
