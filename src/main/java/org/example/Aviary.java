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
    public void maintainAviary() {
        //l'entretien de la volière et la vérification du toit
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
