package org.example;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private String name;
    private double area;
    private int maxCapacity;
    private final List<Creature> creatures;
    private Cleanliness cleanliness;


    public Enclosure(String name, double area, int maxCapacity) {
        this.name = name;
        this.area = area;
        this.maxCapacity = maxCapacity;
        this.creatures = new ArrayList<>();
        this.cleanliness = Cleanliness.BON; // Valeur initiale
    }

    // Ajoute une créature à l'enclos
    public void addCreature(Creature creature) {
        if (creatures.size() < maxCapacity) {
            creatures.add(creature);
        } else {
            System.out.println("L'enclos est plein !");
        }
    }

    // Retire une créature de l'enclos
    public void removeCreature(Creature creature) {
        creatures.remove(creature);
    }

    // Affiche les informations de l'enclos
    public void displayInfo() {
        System.out.println("Nom de l'enclos: " + name);
        System.out.println("Superficie: " + area + " mètres carrés");
        System.out.println("Capacité maximale: " + maxCapacity);
        System.out.println("Propreté: " + cleanliness);
        System.out.println("Créatures présentes: ");
        for (Creature creature : creatures) {
            System.out.println(creature.getName());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Creature> getCreatures() {
        return new ArrayList<>(creatures);
    }

    public Cleanliness getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(Cleanliness cleanliness) {
        this.cleanliness = cleanliness;
    }
}
