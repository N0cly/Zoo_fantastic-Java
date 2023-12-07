package org.example.enclosure;

import org.example.Cleanliness;
import org.example.Creature;
import org.example.Enclosure;
import org.example.interfaces.FlyingCreature;

import java.util.List;

/**
 * La classe Aviary représente un enclos spécifique destiné à des créatures volantes.
 * Elle étend la classe abstraite Enclosure et implémente les fonctionnalités spécifiques à une volière.
 */
public class Aviary extends Enclosure {
    private double height; // Hauteur de la volière

    /**
     * Constructeur de la classe Aviary.
     *
     * @param name        Le nom de la volière.
     * @param area        La superficie de la volière.
     * @param maxCapacity La capacité maximale d'accueil d'animaux.
     * @param creatures   La liste des créatures actuellement dans la volière.
     * @param cleanliness Le niveau de propreté de la volière.
     * @param height      La hauteur de la volière.
     */
    public Aviary(String name, double area, int maxCapacity, List<Creature> creatures, Cleanliness cleanliness,
                  double height) {
        super(name, area, maxCapacity, cleanliness);
        this.height = height;
    }

    /**
     * Ajoute une créature à la volière. Seules les créatures volantes peuvent être ajoutées.
     *
     * @param creature La créature à ajouter à la volière.
     */
    @Override
    public void addCreature(Creature creature) {
        if (!(creature instanceof FlyingCreature)) {
            System.out.println("Seules les créatures volantes peuvent être ajoutées à une volière.");
            return;
        }
        super.addCreature(creature);
    }

    /**
     * Effectue la maintenance de la volière, y compris la vérification du toit.
     */
    @Override
    public void maintainEnclosure() {
        super.maintainEnclosure();
        checkRoof(); // Vérifie le toit de la volière

        setCleanliness(Cleanliness.BON); // Met à jour la propreté de la volière

        System.out.println("La volière a été entretenue et son toit vérifié.");
    }

    /**
     * Vérifie l'état du toit de la volière.
     */
    private void checkRoof() {
        System.out.println("Le toit de la volière a été vérifié et est en bon état.");
    }

    /**
     * Obtient la hauteur de la volière.
     *
     * @return La hauteur de la volière.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Définit la hauteur de la volière.
     *
     * @param height La nouvelle hauteur de la volière.
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
