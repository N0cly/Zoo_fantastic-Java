package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

/**
 * La classe Kraken représente une créature de type kraken.
 * Elle étend la classe abstraite Creature et implémente plusieurs interfaces liées à l'environnement aquatique.
 */
public class Kraken extends Creature implements Swim, Oviparous, AquaticCreature {

    /**
     * Constructeur de la classe Kraken.
     *
     * @param name   Le nom du kraken.
     * @param gender Le genre du kraken.
     * @param weight Le poids du kraken.
     * @param height La hauteur du kraken.
     * @param age    L'âge du kraken.
     * @param health La santé du kraken.
     * @param cries  Le cri du kraken.
     */
    public Kraken(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name, gender, weight, height, age, health, cries);
        this.setSpecies("Kraken");
    }

    /**
     * Implémentation de la méthode de l'interface Swim.
     *
     * @return Une chaîne de caractères indiquant que le kraken se déplace puissamment dans l'eau.
     */
    @Override
    public String swim() {
        System.out.println("Le Kraken se déplace puissamment dans l'eau.");
        return "Le Kraken se déplace puissamment dans l'eau.";
    }
}
