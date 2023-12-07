package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

/**
 * La classe Phenix représente une créature de type Phénix.
 * Elle étend la classe abstraite Creature et implémente plusieurs interfaces liées à sa capacité de vol et à sa reproduction par œufs.
 */
public class Phenix extends Creature implements Fly, Oviparous, FlyingCreature {

    /**
     * Constructeur de la classe Phenix.
     *
     * @param name   Le nom du Phénix.
     * @param gender Le genre du Phénix.
     * @param weight Le poids du Phénix.
     * @param height La hauteur du Phénix.
     * @param age    L'âge du Phénix.
     * @param health La santé du Phénix.
     * @param cries  Le cri du Phénix.
     */
    public Phenix(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name, gender, weight, height, age, health, cries);
        this.setSpecies("Phenix");
    }

    /**
     * Implémentation de la méthode de l'interface Fly.
     *
     * @return Une chaîne de caractères indiquant que le Phénix s'élève dans les airs.
     */
    @Override
    public String fly() {
        System.out.println("Le Phenix s'élève dans les airs.");
        return "Le Phenix s'élève dans les airs.";
    }
}
