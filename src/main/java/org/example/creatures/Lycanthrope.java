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



    public Lycanthrope(String name, String species, String gender, int weight, int height, int age, int health, String cries) {
        super(name, species, gender, weight, height, age, health, cries);
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
    public void howl() {
        System.out.println(this.getName() + " hurle.");
        // Implémenter la logique de communication par hurlement
    }

    // Entendre un hurlement
    public void hearHowl() {
        if (!this.isSleeping() && this.isAlive()) {
            System.out.println(this.getName() + " entend un hurlement.");
            // Implémenter la réaction au hurlement
        }
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
    public ZooKeeper transformIntoHuman() {
        System.out.println(this.getName() + " se transforme en humain.");
        return new ZooKeeper(this.getName(), this.getGender(), this.getAge());
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " court rapidement.");
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }



}