package org.example.creatures;

import org.example.Creature;
import org.example.ZooKeeper;
import org.example.interfaces.*;

/**
 * La classe Lycanthrope représente une créature de type lycanthrope.
 * Elle étend la classe abstraite Creature et implémente plusieurs interfaces liées à ses caractéristiques et capacités.
 */
public class Lycanthrope extends Creature implements Run, Viviparous {

    // Caractéristiques spécifiques au lycanthrope
    private String gender; // sexe
    private String ageCategory; // catégorie d'âge
    private int strength; // force
    private int dominationFactor; // facteur de domination
    private char rank; // rang
    private int level; // niveau
    private int impetuosity; // impétuosité
    private Pack pack; // meute

    /**
     * Constructeur de la classe Lycanthrope.
     *
     * @param name   Le nom du lycanthrope.
     * @param gender Le sexe du lycanthrope.
     * @param weight Le poids du lycanthrope.
     * @param height La hauteur du lycanthrope.
     * @param age    L'âge du lycanthrope.
     * @param health La santé du lycanthrope.
     * @param cries  Le cri du lycanthrope.
     */
    public Lycanthrope(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name, gender, weight, height, age, health, cries);
        this.setSpecies("Lycanthrope");
    }

    /**
     * Affiche les caractéristiques spécifiques du lycanthrope.
     */
    public void displayCharacteristics() {
        super.displayInfo(); // Affiche les informations de base de la créature
        System.out.println("Sexe: " + gender);
        System.out.println("Catégorie d'âge: " + ageCategory);
        System.out.println("Force: " + strength);
        System.out.println("Facteur de domination: " + dominationFactor);
        System.out.println("Rang: " + rank);
        System.out.println("Niveau: " + level);
        System.out.println("Impétuosité: " + impetuosity);
        System.out.println("Meute: " + (pack != null ? pack.getName() : "Solitaire"));
    }

    /**
     * Le lycanthrope pousse un cri.
     */
    public void cries() {
        System.out.println(this.getName() + " hurle." + this.getCries());
        // Implémenter la logique de communication par hurlement
    }

    // Méthodes d'accès pour les caractéristiques spécifiques au lycanthrope

    /**
     * Obtient la catégorie d'âge du lycanthrope.
     *
     * @return La catégorie d'âge du lycanthrope.
     */
    public String getAgeCategory() {
        return ageCategory;
    }

    /**
     * Définit la catégorie d'âge du lycanthrope.
     *
     * @param ageCategory La nouvelle catégorie d'âge du lycanthrope.
     */
    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    /**
     * Obtient la force du lycanthrope.
     *
     * @return La force du lycanthrope.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Définit la force du lycanthrope.
     *
     * @param strength La nouvelle force du lycanthrope.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Obtient le facteur de domination du lycanthrope.
     *
     * @return Le facteur de domination du lycanthrope.
     */
    public int getDominationFactor() {
        return dominationFactor;
    }

    /**
     * Définit le facteur de domination du lycanthrope.
     *
     * @param dominationFactor Le nouveau facteur de domination du lycanthrope.
     */
    public void setDominationFactor(int dominationFactor) {
        this.dominationFactor = dominationFactor;
    }

    /**
     * Obtient le rang du lycanthrope.
     *
     * @return Le rang du lycanthrope.
     */
    public char getRank() {
        return rank;
    }

    /**
     * Définit le rang du lycanthrope.
     *
     * @param rank Le nouveau rang du lycanthrope.
     */
    public void setRank(char rank) {
        this.rank = rank;
    }

    /**
     * Obtient le niveau du lycanthrope.
     *
     * @return Le niveau du lycanthrope.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Définit le niveau du lycanthrope.
     *
     * @param level Le nouveau niveau du lycanthrope.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Obtient l'impétuosité du lycanthrope.
     *
     * @return L'impétuosité du lycanthrope.
     */
    public int getImpetuosity() {
        return impetuosity;
    }

    /**
     * Définit l'impétuosité du lycanthrope.
     *
     * @param impetuosity La nouvelle impétuosité du lycanthrope.
     */
    public void setImpetuosity(int impetuosity) {
        this.impetuosity = impetuosity;
    }

    /**
     * Obtient la meute à laquelle le lycanthrope appartient.
     *
     * @return La meute du lycanthrope ou null s'il est solitaire.
     */
    public Pack getPack() {
        return pack;
    }

    // Méthodes spécifiques au lycanthrope

    /**
     * Le lycanthrope entend un hurlement.
     *
     * @return Une chaîne de caractères indiquant que le lycanthrope entend un hurlement.
     */
    public String hearHowl() {
        if (!this.isSleeping() && this.isAlive()) {
            System.out.println(this.getName() + " entend un hurlement.");
            // Implémenter la réaction au hurlement
        }
        return this.getName() + " entend un hurlement.";
    }

    /**
     * Le lycanthrope quitte sa meute.
     */
    public void leavePack() {
        if (this.pack != null) {
            this.pack.removeMember(this);
            this.pack = null;
            System.out.println(this.getName() + " a quitté la meute.");
        }
    }

    /**
     * Le lycanthrope se transforme en humain.
     *
     * @return Une chaîne de caractères indiquant que le lycanthrope se transforme en humain.
     */
    public String transformIntoHuman() {
        System.out.println(this.getName() + " se transforme en humain.");
        new ZooKeeper(this.getName(), this.getGender(), this.getAge());
        return this.getName() + " se transforme en humain.";
    }

    /**
     * Implémentation de la méthode de l'interface Run.
     */
    @Override
    public void run() {
        System.out.println(this.getName() + " court rapidement.");
    }

    // Méthodes d'accès pour le sexe du lycanthrope

    /**
     * Obtient le sexe du lycanthrope.
     *
     * @return Le sexe du lycanthrope.
     */
    @Override
    public String getGender() {
        return gender;
    }

    /**
     * Définit le sexe du lycanthrope.
     *
     * @param gender Le nouveau sexe du lycanthrope.
     */
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Définit la meute à laquelle le lycanthrope appartient.
     *
     * @param pack La nouvelle meute du lycanthrope.
     */
    public void setPack(Pack pack) {
        this.pack = pack;
    }
}
