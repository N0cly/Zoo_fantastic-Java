package org.example;

import java.util.List;

public class Aquarium extends Enclosure {
    private double depth; // Profondeur du bassin
    private double salinity; // Salinité de l'eau
    public Aquarium(String name, double area, int maxCapacity, List<Creature> creatures, Cleanliness cleanliness) {
        super(name, area, maxCapacity, creatures, cleanliness);
        this.depth = depth;
        this.salinity = salinity;
    }

    @Override
    public void addCreature(Creature creature) {
        if (!(creature instanceof AquaticCreature)) {
            System.out.println("Seules les créatures aquatiques peuvent être ajoutées à un aquarium.");
            return;
        }
        super.addCreature(creature);
    }

    public void maintainAquarium() {
        // l'entretien de l'aquarium, la vérification de la profondeur et de la salinité
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getSalinity() {
        return salinity;
    }

    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }
}
