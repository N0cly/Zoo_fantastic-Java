package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

/**
 * La classe Dragon représente une créature de type dragon.
 * Elle étend la classe abstraite Creature et implémente plusieurs interfaces.
 */
public class Dragon extends Creature implements Run, Swim, Fly, Oviparous, FlyingCreature, AquaticCreature {

    /**
     * Constructeur de la classe Dragon.
     *
     * @param name   Le nom du dragon.
     * @param gender Le genre du dragon.
     * @param weight Le poids du dragon.
     * @param height La hauteur du dragon.
     * @param age    L'âge du dragon.
     * @param health La santé du dragon.
     * @param cries  Le cri du dragon.
     */
    public Dragon(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name, gender, weight, height, age, health, cries);
        this.setSpecies("Dragon");
    }

    /**
     * Implémentation de la méthode de l'interface Fly.
     *
     * @return Une chaîne de caractères indiquant que le dragon s'envole dans les airs.
     */
    @Override
    public String fly() {
        System.out.println("Le Dragon s'envole dans les airs.");
        return "Le Dragon s'envole dans les airs.";
    }

    /**
     * Implémentation de la méthode de l'interface Swim.
     *
     * @return Une chaîne de caractères indiquant que le dragon se déplace dans l'eau.
     */
    @Override
    public String swim() {
        System.out.println("Le Dragon se déplace dans l'eau.");
        return null;
    }
}
