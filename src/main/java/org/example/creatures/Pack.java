package org.example.creatures;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private String name; // Nom de la meute
    private Lycanthrope alphaMale;
    private Lycanthrope alphaFemale;
    private List<Lycanthrope> members; // Membres de la meute

    // Constructeur pour initialiser la meute avec un nom et éventuellement des membres préexistants
    public Pack(String name) {
        this.name = name;
        this.members = new ArrayList<>(); // Initialiser la liste des membres
    }

    // Ajoutez un membre à la meute
    public void addMember(Lycanthrope lycanthrope) {
        if (!members.contains(lycanthrope)) {
            members.add(lycanthrope);

            lycanthrope.setPack(this); // Défini la meute du lycanthrope sur cette meute
        }
    }

    // Retirez un membre de la meute
    public void removeMember(Lycanthrope lycanthrope) {
        if (members.remove(lycanthrope)) {
            lycanthrope.setPack(null);// Défini la meute du lycanthrope sur null car il n'appartient plus à cette meute
        }
    }

    public void setAlphaCouple(Lycanthrope male, Lycanthrope female) {
        this.alphaMale = male;
        this.alphaFemale = female;
        // Ajoutez la logique nécessaire pour gérer le changement du couple alpha
    }

    // Lancer une reproduction
    public void reproduce() {
        // Logique de reproduction, potentiellement liée au couple α
    }

    // Afficher les caractéristiques de la meute
    public void displayPackInfo() {
        System.out.println("Meute dirigée par : " + alphaMale.getName() + " et " + alphaFemale.getName());
        System.out.println("Membres de la meute : ");
        for (Lycanthrope member : members) {
            member.displayCharacteristics();
        }
    }

    public void manageDomination(Lycanthrope dominator, Lycanthrope submissive) {
        // Gérez la domination et la soumission
    }

    // Obtenez le nom de la meute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lycanthrope getAlphaMale() {
        return alphaMale;
    }

    public void setAlphaMale(Lycanthrope alphaMale) {
        this.alphaMale = alphaMale;
    }

    public Lycanthrope getAlphaFemale() {
        return alphaFemale;
    }

    public void setAlphaFemale(Lycanthrope alphaFemale) {
        this.alphaFemale = alphaFemale;
    }

    public List<Lycanthrope> getMembers() {
        return members;
    }

    public void setMembers(List<Lycanthrope> members) {
        this.members = members;
    }
}
