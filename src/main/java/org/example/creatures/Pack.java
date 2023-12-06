package org.example.creatures;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private String name; // Nom de la meute
    private List<Lycanthrope> members; // Membres de la meute

    // Constructeur pour initialiser la meute avec un nom et éventuellement des membres préexistants
    public Pack(String name) {
        this.name = name;
        this.members = new ArrayList<>(); // Initialiser la liste des membres
    }

    // Obtenez le nom de la meute
    public String getName() {
        return name;
    }

    // Ajoutez un membre à la meute
    public void addMember(Lycanthrope lycanthrope) {
        if (!members.contains(lycanthrope)) {
            members.add(lycanthrope);
            // Définissez la meute du lycanthrope sur cette meute
            lycanthrope.setPack(this);
        }
    }

    // Retirez un membre de la meute
    public void removeMember(Lycanthrope lycanthrope) {
        if (members.remove(lycanthrope)) {
            // Définissez la meute du lycanthrope sur null car il n'appartient plus à cette meute
            lycanthrope.setPack(null);
        }
    }

    // Affichez les informations sur tous les membres de la meute
    public void displayMembersInfo() {
        System.out.println("Membres de la meute " + name + ":");
        for (Lycanthrope member : members) {
            member.displayCharacteristics();
        }
    }

    // Getters et setters pour les attributs de la classe
    // ...

    // ... autres méthodes et logiques ...
}
