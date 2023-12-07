package org.example.creatures;

import org.example.Creature;
import org.example.interfaces.*;

/**
 * La classe Unicorne représente une créature de type licorne.
 * Elle étend la classe abstraite Creature et implémente plusieurs interfaces liées à sa capacité de course et à sa reproduction vivipare.
 */
public class Unicorne extends Creature implements Run, Viviparous {

    /**
     * Constructeur de la classe Unicorne.
     *
     * @param name   Le nom de la licorne.
     * @param gender Le genre de la licorne.
     * @param weight Le poids de la licorne.
     * @param height La hauteur de la licorne.
     * @param age    L'âge de la licorne.
     * @param health La santé de la licorne.
     * @param cries  Le cri de la licorne.
     */
    public Unicorne(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name, gender, weight, height, age, health, cries);
        this.setSpecies("Unicorne");
    }

}
