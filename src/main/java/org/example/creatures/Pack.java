package org.example.creatures;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Pack représente une meute de lycanthropes.
 */
public class Pack {
    private String name; // Nom de la meute
    private Lycanthrope alphaMale; // Mâle alpha de la meute
    private Lycanthrope alphaFemale; // Femelle alpha de la meute
    private List<Lycanthrope> members; // Membres de la meute

    /**
     * Constructeur pour initialiser une meute avec un nom.
     *
     * @param name Le nom de la meute.
     */
    public Pack(String name) {
        this.name = name;
        this.members = new ArrayList<>(); // Initialiser la liste des membres
    }

    /**
     * Ajoute un lycanthrope à la meute.
     *
     * @param lycanthrope Le lycanthrope à ajouter à la meute.
     */
    public void addMember(Lycanthrope lycanthrope) {
        if (!members.contains(lycanthrope)) {
            members.add(lycanthrope);
            lycanthrope.setPack(this); // Définir la meute du lycanthrope sur cette meute
        }
    }

    /**
     * Retire un lycanthrope de la meute.
     *
     * @param lycanthrope Le lycanthrope à retirer de la meute.
     */
    public void removeMember(Lycanthrope lycanthrope) {
        if (members.remove(lycanthrope)) {
            lycanthrope.setPack(null); // Définir la meute du lycanthrope sur null car il n'appartient plus à cette meute
        }
    }

    /**
     * Définit le couple alpha de la meute.
     *
     * @param male   Le mâle alpha.
     * @param female La femelle alpha.
     */
    public void setAlphaCouple(Lycanthrope male, Lycanthrope female) {
        this.alphaMale = male;
        this.alphaFemale = female;
        // Ajouter la logique nécessaire pour gérer le changement du couple alpha
    }

    /**
     * Lance une reproduction au sein de la meute.
     */
    public void reproduce() {
        // Logique de reproduction, potentiellement liée au couple α
    }

    /**
     * Affiche les caractéristiques de la meute.
     */
    public void displayPackInfo() {
        System.out.println("Meute dirigée par : " + alphaMale.getName() + " et " + alphaFemale.getName());
        System.out.println("Membres de la meute : ");
        for (Lycanthrope member : members) {
            member.displayCharacteristics();
        }
    }

    /**
     * Gère la domination entre deux lycanthropes au sein de la meute.
     *
     * @param dominator  Le lycanthrope dominant.
     * @param submissive Le lycanthrope soumis.
     */
    public void manageDomination(Lycanthrope dominator, Lycanthrope submissive) {
        // Gérer la domination et la soumission
    }

    /**
     * Obtient le nom de la meute.
     *
     * @return Le nom de la meute.
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom de la meute.
     *
     * @param name Le nouveau nom de la meute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtient le mâle alpha de la meute.
     *
     * @return Le mâle alpha.
     */
    public Lycanthrope getAlphaMale() {
        return alphaMale;
    }

    /**
     * Définit le mâle alpha de la meute.
     *
     * @param alphaMale Le nouveau mâle alpha.
     */
    public void setAlphaMale(Lycanthrope alphaMale) {
        this.alphaMale = alphaMale;
    }

    /**
     * Obtient la femelle alpha de la meute.
     *
     * @return La femelle alpha.
     */
    public Lycanthrope getAlphaFemale() {
        return alphaFemale;
    }

    /**
     * Définit la femelle alpha de la meute.
     *
     * @param alphaFemale La nouvelle femelle alpha.
     */
    public void setAlphaFemale(Lycanthrope alphaFemale) {
        this.alphaFemale = alphaFemale;
    }

    /**
     * Obtient la liste des membres de la meute.
     *
     * @return La liste des membres de la meute.
     */
    public List<Lycanthrope> getMembers() {
        return members;
    }

    /**
     * Définit la liste des membres de la meute.
     *
     * @param members La nouvelle liste des membres de la meute.
     */
    public void setMembers(List<Lycanthrope> members) {
        this.members = members;
    }
}
