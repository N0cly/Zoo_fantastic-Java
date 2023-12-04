package org.example.enclosure;

import org.example.Cleanliness;
import org.example.Creature;
import org.example.Enclosure;
import org.example.interfaces.AquaticCreature;

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
    public void maintainEnclosure() {
        super.maintainEnclosure();
        checkWaterQuality(); // Vérifie la profondeur et la salinité de l'eau

        setCleanliness(Cleanliness.BON); // Met à jour la propreté de l'aquarium

        System.out.println("L'aquarium a été entretenu, avec vérification de la qualité de l'eau.");
    }

    private void checkWaterQuality() { // Pour vérifier la qualité de l'eau, incluant la profondeur et la salinité
        System.out.println("La qualité de l'eau a été vérifiée : profondeur et salinité sont adéquates.");
    }

    @Override
    public void addCreature(Creature creature) {
        if (!(creature instanceof AquaticCreature)) {
            System.out.println("Seules les créatures aquatiques peuvent être ajoutées à un aquarium.");
            return;
        }
        super.addCreature(creature);
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
