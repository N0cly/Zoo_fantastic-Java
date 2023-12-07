package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

/**
 * La classe Megalodons représente une créature de type Megalodon.
 * Elle étend la classe abstraite Creature et implémente plusieurs interfaces liées à son environnement aquatique.
 */
public class Megalodons extends Creature implements Swim, Oviparous, AquaticCreature {

    /**
     * Constructeur de la classe Megalodons.
     *
     * @param name   Le nom du Megalodon.
     * @param gender Le genre du Megalodon.
     * @param weight Le poids du Megalodon.
     * @param height La hauteur du Megalodon.
     * @param age    L'âge du Megalodon.
     * @param health La santé du Megalodon.
     * @param cries  Le cri du Megalodon.
     */
    public Megalodons(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name, gender, weight, height, age, health, cries);
        this.setSpecies("Megalodons");
    }

    /**
     * Implémentation de la méthode de l'interface Swim.
     *
     * @return Une chaîne de caractères indiquant que le Megalodon se déplace puissamment dans l'eau.
     */
    @Override
    public String swim() {
        System.out.println("Le Megalodon se déplace puissamment dans l'eau.");
        return "Le Megalodon se déplace puissamment dans l'eau.";
    }
}
