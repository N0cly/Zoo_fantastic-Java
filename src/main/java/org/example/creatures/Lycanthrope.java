package org.example.creatures;

import org.example.Creature;
import org.example.ZooKeeper;
import org.example.interfaces.*;

public class Lycanthrope extends Creature implements Run, Viviparous {

    private String gender; // sexe
    private String ageCategory; // catégorie d'âge
    private int strength; // force
    private int dominationFactor; // facteur de domination
    private char rank; // rang
    private int level; // niveau
    private int impetuosity; // impétuosité
    private Pack pack; // meute



    public Lycanthrope(String name, String gender, int weight, int height, int age, int health, String cries) {
        super(name,gender, weight, height, age, health, cries);
        this.setSpecies("Lycanthrope");
    }
    // Afficher les caractéristiques

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

    // Hurler

    public void cries() {
        System.out.println(this.getName() + " hurle." + this.getCries());
        // Implémenter la logique de communication par hurlement

    }


    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDominationFactor() {
        return dominationFactor;
    }

    public void setDominationFactor(int dominationFactor) {
        this.dominationFactor = dominationFactor;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getImpetuosity() {
        return impetuosity;
    }

    public void setImpetuosity(int impetuosity) {
        this.impetuosity = impetuosity;
    }

    public Pack getPack() {
        return pack;
    }


    // Entendre un hurlement
    public String hearHowl() {
        if (!this.isSleeping() && this.isAlive()) {
            System.out.println(this.getName() + " entend un hurlement.");
            // Implémenter la réaction au hurlement
        }
        return this.getName() + " entend un hurlement.";
    }

    // Se séparer de sa meute
    public void leavePack() {
        if (this.pack != null) {
            this.pack.removeMember(this);
            this.pack = null;
            System.out.println(this.getName() + " a quitté la meute.");
        }
    }

    // Se transformer en humain
    public String transformIntoHuman() {
        System.out.println(this.getName() + " se transforme en humain.");
        new ZooKeeper(this.getName(), this.getGender(), this.getAge());
        return this.getName() + " se transforme en humain.";
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " court rapidement.");
    }
    

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }
}