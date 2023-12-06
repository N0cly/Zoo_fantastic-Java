package org.example;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private static String name;
    private static double area;
    private static int maxCapacity;
    private static List<Creature> creatures;
    private static Cleanliness cleanliness;

    public Enclosure(String name, double area, int maxCapacity, Cleanliness cleanliness) {
        Enclosure.name = name;
        Enclosure.area = area;
        Enclosure.maxCapacity = maxCapacity;
        Enclosure.creatures = new ArrayList<Creature>();
        Enclosure.cleanliness = cleanliness;
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

    public static void displayEnclosure() {
        System.out.println("Nom de l'enclos: " + name);
        System.out.println("Superficie: " + area + " mètres carrés");
        System.out.println("Capacité maximale: " + maxCapacity);
        System.out.println("Propreté: " + cleanliness);
        System.out.println("Créatures présentes:");// TODO
        System.out.println("Nombre de créatures: " + getNumberOfCreatures());
        for (Creature creature : creatures) {
            System.out.println(creature.getName());
        }
        if (!creatures.isEmpty()) {
            System.out.println("Créatures présentes:");
            for (Creature creature : creatures) {
                System.out.println(creature);
            }
        } else {
            System.out.println("Aucune créature présente.");
        }
    }

    // Affiche les informations de l'enclos
    public void displayInfo() {
        System.out.println("Nom de l'enclos: " + name);
        System.out.println("Superficie: " + area + " mètres carrés");
        System.out.println("Capacité maximale: " + maxCapacity);
        System.out.println("Propreté: " + cleanliness);
        System.out.println("Créatures présentes: ");// TODO
        System.out.println("Nombre de créatures: " + getNumberOfCreatures());
        for (Creature creature : creatures) {
            System.out.println(creature.getName());
        }
        if (!creatures.isEmpty()) {
            System.out.println("Créatures présentes:");
            for (Creature creature : creatures) {
                System.out.println(creature);
            }
        } else {
            System.out.println("Aucune créature présente.");
        }
    }

    public void maintainEnclosure() {
        if (creatures.isEmpty() && cleanliness != Cleanliness.BON) {
            cleanliness = Cleanliness.BON;
            System.out.println("L'enclos a été nettoyé et est maintenant en bon état.");
        } else {
            System.out.println("L'entretien de l'enclos n'est pas possible actuellement.");
        }
    }

    public void feedCreatures() {// Pour nourrir toutes les créatures de l'enclos
        if (!creatures.isEmpty()) {
            for (Creature creature : creatures) {
                creature.eat();
            }
        } else {
            System.out.println("Il n'y a pas de créatures à nourrir dans l'enclos " + name);
        }
    }

    public static int getNumberOfCreatures() {
        return creatures.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Enclosure.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        Enclosure.area = area;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        Enclosure.maxCapacity = maxCapacity;
    }

    public List<Creature> getCreatures() {
        return new ArrayList<>(creatures);
    }

    public Cleanliness getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(Cleanliness cleanliness) {
        Enclosure.cleanliness = cleanliness;
    }
}
