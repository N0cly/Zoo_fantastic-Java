package org.example.enclosure;

import org.example.Cleanliness;
import org.example.Creature;
import org.example.Enclosure;
import org.example.interfaces.AquaticCreature;

import java.util.List;

/**
 * La classe Aquarium représente un enclos spécifique destiné à des créatures aquatiques.
 * Elle étend la classe abstraite Enclosure et implémente les fonctionnalités spécifiques à un aquarium.
 */
public class Aquarium extends Enclosure {
    private double depth; // Profondeur du bassin
    private double salinity; // Salinité de l'eau

    /**
     * Constructeur de la classe Aquarium.
     *
     * @param name         Le nom de l'aquarium.
     * @param area         La superficie de l'aquarium.
     * @param maxCapacity  La capacité maximale d'accueil d'animaux.
     * @param creatures    La liste des créatures actuellement dans l'aquarium.
     * @param cleanliness  Le niveau de propreté de l'aquarium.
     */
    public Aquarium(String name, double area, int maxCapacity, List<Creature> creatures, Cleanliness cleanliness) {
        super(name, area, maxCapacity, cleanliness);
        this.depth = depth;
        this.salinity = salinity;
    }

    /**
     * Effectue la maintenance de l'aquarium, y compris la vérification de la qualité de l'eau.
     */
    @Override
    public void maintainEnclosure() {
        super.maintainEnclosure();
        checkWaterQuality(); // Vérifie la profondeur et la salinité de l'eau

        setCleanliness(Cleanliness.BON); // Met à jour la propreté de l'aquarium

        System.out.println("L'aquarium a été entretenu, avec vérification de la qualité de l'eau.");
    }

    /**
     * Vérifie la qualité de l'eau de l'aquarium, incluant la profondeur et la salinité.
     */
    private void checkWaterQuality() {
        System.out.println("La qualité de l'eau a été vérifiée : profondeur et salinité sont adéquates.");
    }

    /**
     * Ajoute une créature à l'aquarium. Seules les créatures aquatiques peuvent être ajoutées.
     *
     * @param creature La créature à ajouter à l'aquarium.
     */
    @Override
    public void addCreature(Creature creature) {
        if (!(creature instanceof AquaticCreature)) {
            System.out.println("Seules les créatures aquatiques peuvent être ajoutées à un aquarium.");
            return;
        }
        super.addCreature(creature);
    }

    /**
     * Obtient la profondeur du bassin de l'aquarium.
     *
     * @return La profondeur du bassin.
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Définit la profondeur du bassin de l'aquarium.
     *
     * @param depth La nouvelle profondeur du bassin.
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * Obtient la salinité de l'eau de l'aquarium.
     *
     * @return La salinité de l'eau.
     */
    public double getSalinity() {
        return salinity;
    }

    /**
     * Définit la salinité de l'eau de l'aquarium.
     *
     * @param salinity La nouvelle salinité de l'eau.
     */
    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }
}
