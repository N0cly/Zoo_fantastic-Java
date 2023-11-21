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

    public static List<Creature> getCreatures() {
        return creatures;
    }

    public static void displayMainMenu() {
        System.out.println("===== Zoo Fantastique Menu =====");
        System.out.println("1. Gérer les créatures");
        System.out.println("2. Gérer les enclos");
        System.out.println("4. Quitter");
        System.out.print("Choisissez une option : ");
    }

    public static void displayCreatureMenu() {
        System.out.println("===== Gérer les Créatures =====s");
        System.out.println("1. Afficher les créatures");
        System.out.println("2. Ajouter une créature");
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
            System.out.println("Name : " + creature.getName() + " | " + "Hunger : " + creature.getHunger());
        }
    }

    public static void afficherMenuCreationCreature() {
        System.out.println("1. Dragon");

        System.out.println("2. Retour au menu Gestion Creature");
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
                    System.out.println("Ajout d'une créature...");
                    addCreatureFromUserInput();
                    break;
                case 3:
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

            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre entier.");
                scanner.next(); // Consommer l'entrée incorrecte
            }

            creatureChoice = scanner.nextInt();
            scanner.nextLine(); // Lire la ligne vide après la saisie du nombre

            switch (creatureChoice) {
                case 1:
                    int health = 100;
                    int age = 10;
                    int height = 110;
                    int weight = 80;
                    String name = "name";
                    boolean type = true;

                    System.out.print("Nom du Dragon : ");
                    name = scanner.nextLine().trim(); // Lire toute la ligne y compris les espaces

                    System.out.print("Male(M) ou Femelle(F) (defaut true): ");
                    String stype = scanner.nextLine().trim();
                    if ("M".equals(stype)) {
                        type = false;
                    } else if ("F".equals(stype)) {
                        type = true;
                    }

                    System.out.print("Poids du dragon (defaut = 80) : ");
                    String weightInput = scanner.nextLine().trim();
                    if (!weightInput.isEmpty()) {
                        while (!isNumeric(weightInput)) {
                            System.out.println("Veuillez entrer un nombre entier.");
                            weightInput = scanner.nextLine().trim();
                        }
                        weight = Integer.parseInt(weightInput);
                    }

                    System.out.print("Taille du dragon (defaut = 110) : ");
                    String heightInput = scanner.nextLine().trim();
                    if (!heightInput.isEmpty()) {
                        while (!isNumeric(heightInput)) {
                            System.out.println("Veuillez entrer un nombre entier.");
                            heightInput = scanner.nextLine().trim();
                        }
                        height = Integer.parseInt(heightInput);
                    }

                    System.out.print("Age du dragon (defaut = 10) : ");
                    String ageInput = scanner.nextLine().trim();
                    if (!ageInput.isEmpty()) {
                        while (!isNumeric(ageInput)) {
                            System.out.println("Veuillez entrer un nombre entier.");
                            ageInput = scanner.nextLine().trim();
                        }
                        age = Integer.parseInt(ageInput);
                    }

                    System.out.print("Santé du dragon (defaut = 100) : ");
                    String healthInput = scanner.nextLine().trim();
                    if (!healthInput.isEmpty()) {
                        while (!isNumeric(healthInput)) {
                            System.out.println("Veuillez entrer un nombre entier.");
                            healthInput = scanner.nextLine().trim();
                        }
                        health = Integer.parseInt(healthInput);
                    }

                    Dragon newDragon = new Dragon(name, type, weight, height, age, health, "Cri du Dragon");
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
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

}
