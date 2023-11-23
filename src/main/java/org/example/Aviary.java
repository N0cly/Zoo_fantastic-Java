package org.example;

import java.util.List;

public class Aviary extends Enclosure  {
    private double height;

    public Aviary(String name, double area, int maxCapacity, List<Creature> creatures, Cleanliness cleanliness, double height) {
        super(name, area, maxCapacity, creatures, cleanliness);
        this.height = height;
    }
    @Override
    public void addCreature(Creature creature) {
        if (!(creature instanceof FlyingCreature)) {
            System.out.println("Seules les créatures volantes peuvent être ajoutées à une volière.");
            return;
        }
        super.addCreature(creature);
    }

    @Override
    public void maintainEnclosure() {
        super.maintainEnclosure();
        checkRoof(); // Vérifie le toit de la volière

        setCleanliness(Cleanliness.BON); // Met à jour la propreté de la volière

        System.out.println("La volière a été entretenue et son toit vérifié.");
    }

    private void checkRoof() { // Pour vérifier l'état du toit de la volière
        System.out.println("Le toit de la volière a été vérifié et est en bon état.");
    }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }
}
