package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

/**
 * La classe Mermaids représente une créature de type sirène.
 * Elle étend la classe abstraite Creature et implémente plusieurs interfaces liées à son environnement aquatique.
 */
public class Mermaids extends Creature implements Swim, Viviparous, AquaticCreature {

    /**
     * Constructeur de la classe Mermaids.
     *
     * @param name   Le nom de la sirène.
     * @param gender Le genre de la sirène.
     * @param weight Le poids de la sirène.
     * @param height La hauteur de la sirène.
     * @param age    L'âge de la sirène.
     * @param health La santé de la sirène.
     * @param cries  Le cri de la sirène.
     */
    public Mermaids(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name, gender, weight, height, age, health, cries);
        this.setSpecies("Mermaids");
    }

    /**
     * Implémentation de la méthode de l'interface Swim.
     *
     * @return Une chaîne de caractères indiquant que la sirène nage dans l'eau.
     */
    @Override
    public String swim() {
        System.out.println("La sirène nage dans l'eau.");
        return "La sirène nage dans l'eau.";
    }
}
