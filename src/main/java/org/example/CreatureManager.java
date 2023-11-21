package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CreatureManager {
    private static List<Creature> creatures;

    public CreatureManager() {
        this.creatures = new ArrayList<>();
        // Initialisez vos créatures ici si nécessaire
    }

    public static void addCreature(Creature creature) {
        creatures.add(creature);
    }

    public List<Creature> getCreatures() {
        return creatures;
    }

    public static void displayMainMenu() {
        System.out.println("===== Zoo Fantastique Menu =====");
        System.out.println("1. Gérer les créatures");
        System.out.println("2. Gérer les enclos");
        System.out.println("3. Simuler le passage du temps");
        System.out.println("4. Quitter");
        System.out.print("Choisissez une option : ");
    }

    public static void displayCreatureMenu() {
        System.out.println("===== Gérer les Créatures =====s");
        System.out.println("1. Afficher les créatures");
        System.out.println("2. Ajouter une créature");
        System.out.println("3. Soigner une créature");
        System.out.println("4. Retour au menu principal");
    }

    public static void displayEnclosureMenu() {
        System.out.println("===== Gérer les Enclos =====");
        System.out.println("1. Afficher les enclos");
        System.out.println("2. Ajouter un enclos");
        System.out.println("3. Retour au menu principal");
    }

    public static void displayCreatures() {
        System.out.println("===== Liste des Créatures =====");
        for (Creature creature : creatures) {
            System.out.println("Name : " + creature.getName());
        }
    }

    public static void afficherMenuCreationCreature() {
        System.out.println("1. Dragon");

        System.out.println("2. Retour au menu principal");
    }

    static void runEnclosureMenu() {

        Scanner scanner = new Scanner(System.in);
        int enclosureChoice;

        do {
            displayEnclosureMenu();
            System.out.print("Choisissez une option : ");
            enclosureChoice = scanner.nextInt();

            switch (enclosureChoice) {
                case 1:
                    // Ajouter la logique pour afficher les enclos
                    System.out.println("Affichage des enclos...");
                    break;
                case 2:
                    // Ajouter la logique pour ajouter un enclos
                    System.out.println("Ajout d'un enclos...");
                    break;
                case 3:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }
        } while (enclosureChoice != 3);
    }

    static void runCreatureMenu() {

        Scanner scanner = new Scanner(System.in);
        int creatureChoice;

        do {
            displayCreatureMenu();
            System.out.print("Choisissez une option : ");
            creatureChoice = scanner.nextInt();

            switch (creatureChoice) {
                case 1:
                    System.out.println("Affichage des créatures...");
                    displayCreatures();
                    break;
                case 2:
                    // Ajouter la logique pour ajouter une créature
                    System.out.println("Ajout d'une créature...");
                    addCreatureFromUserInput();
                    break;
                case 3:
                    // Ajouter la logique pour soigner une créature
                    System.out.println("Soigner une créature...");
                    break;
                case 4:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }
        } while (creatureChoice != 4);
    }

    public static void addCreatureFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        int creatureChoice;

        do {
            System.out.println("Ajout d'une nouvelle créature...");
            System.out.println("Quelle Creature souhaitez-vous créer? ");
            afficherMenuCreationCreature();
            creatureChoice = scanner.nextInt();

            switch (creatureChoice) {
                case 1:
                    System.out.print("Nom du Dragon : ");
                    String name = scanner.next();
                    Dragon newDragon = new Dragon(name, true, 50, 50, 0, 100, "Cri du Dragon");
                    addCreature(newDragon);
                    System.out.println("Dragon ajouté avec succès !");
                    break;
                case 2:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }

            if (creatureChoice == 2) {
                break;
            }
        } while (creatureChoice != 2);

        // Ne fermez pas le scanner ici, fermez-le à la fin du programme.
    }

}
