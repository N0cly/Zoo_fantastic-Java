package org.example;

import org.example.creatures.Dragon;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CreatureManager {
    private static List<Creature> creatures;
    private static List<Thread> creatureThreads;
    private static Enclosure enclosParDefaut;
    private static Scanner scanner = new Scanner(System.in);

    public CreatureManager(Enclosure enclosParDefaut) {
        CreatureManager.enclosParDefaut = enclosParDefaut;
        CreatureManager.creatures = new ArrayList<>();
        CreatureManager.creatureThreads = new ArrayList<>();
    }

    public static void addCreature(Creature creature) {
        creatures.add(creature);

        Thread creatureThread = new Thread(creature);
        creatureThreads.add(creatureThread);
        creatureThread.start();
    }

    public List<Creature> getCreatures() {
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

    public static void afficherMenuCreationCreature() {
        System.out.println("1. Dragon");

        System.out.println("2. Retour au menu Gestion Creature");
    }

    public static void displayCreatures() {
        System.out.println("===== Liste des Créatures =====");

        if (creatures != null) {
            for (Creature creature : creatures) {
                System.out.println("Name : " + creature.getName() + " | " + "Hunger : " + creature.getHunger());
            }
        } else {
            System.out.println("La liste de créatures est nulle.");
        }
    }

    public void removeCreature(Creature creature) {
        creatures.remove(creature);
    }

    public static String nameCreature() {
        System.out.print("Nom de la créature : ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty() || name.isBlank()) {
            System.out.println("Il faut donner un nom à la créature !");
            System.out.print("Nom de la créature : ");
            name = scanner.nextLine().trim();
        }
        System.out.println("Nom : " + name);
        return name;
    }

    public static boolean typeCreature() {
        System.out.print("Male(M) ou Femelle(F) (defaut F): ");
        String stype = scanner.nextLine().trim();
        if (!stype.isEmpty()) {
            while (!stype.equals("M") || !stype.equals("F") || !stype.equals("")) {
                System.out.println("Caractere saisi incorrect");
                System.out.print("Male(M) ou Femelle(F) (defaut F): ");
                stype = scanner.nextLine().trim();
                if ("M".equals(stype)) {
                    System.out.println("Type : Male");
                    return true;
                } else if ("F".equals(stype)) {
                    System.out.println("Type : Femelle");
                    return false;
                }
            }
        }
        if ("M".equals(stype)) {
            System.out.println("Type : Male");
            return true;
        } else if ("F".equals(stype)) {
            System.out.println("Type : Femelle");
            return false;
        }
        System.out.println("Type par défaut : Femelle");
        return false;
    }

    public static int weightCreature() {
        System.out.print("Poids de la créature (defaut = 80) : ");
        String weightInput = scanner.nextLine().trim();
        if (!weightInput.isEmpty()) {
            while (!isNumeric(weightInput)) {
                System.out.println("Veuillez entrer un nombre entier.");
                System.out.print("Poids de la créature (defaut = 80) : ");
                weightInput = scanner.nextLine().trim();
            }
            System.out.println("Poids : " + weightInput);
            return Integer.parseInt(weightInput);
        }
        System.out.println("Poids par défaut : 80");
        return 80;
    }

    public static int heightCreature() {
        System.out.print("Taille de la créature (defaut = 110) : ");
        String heightInput = scanner.nextLine().trim();
        if (!heightInput.isEmpty()) {
            while (!isNumeric(heightInput)) {
                System.out.println("Veuillez entrer un nombre entier.");
                System.out.print("Taille de la créature (defaut = 110) : ");
                heightInput = scanner.nextLine().trim();
            }
            System.out.println("Taille : " + heightInput);
            return Integer.parseInt(heightInput);
        }
        System.out.println("Taille par défaut : 110");
        return 110;
    }

    public static int ageCreature() {
        System.out.print("Age de la créature (defaut = 10) : ");
        String ageInput = scanner.nextLine().trim();
        if (!ageInput.isEmpty()) {
            while (!isNumeric(ageInput)) {
                System.out.println("Veuillez entrer un nombre entier.");
                System.out.print("Age de la créature (defaut = 10) : ");
                ageInput = scanner.nextLine().trim();
            }
            System.out.println("Age : " + ageInput);
            return Integer.parseInt(ageInput);
        }
        System.out.println("Age par défaut : 10");
        return 10;
    }

    public static int healthCreature() {
        System.out.print("Santé de la créature (defaut = 100) : ");
        String healthInput = scanner.nextLine().trim();
        if (!healthInput.isEmpty()) {
            while (!isNumeric(healthInput)) {
                System.out.println("Veuillez entrer un nombre entier.");
                System.out.print("Santé de la créature (defaut = 100) : ");
                healthInput = scanner.nextLine().trim();
            }
            System.out.println("Santé : " + healthInput);
            return Integer.parseInt(healthInput);
        }
        System.out.println("Santé par défaut : 100");
        return 100;
    }

    void runEnclosureMenu() {

        int enclosureChoice;

        do {
            displayEnclosureMenu();
            System.out.print("Choisissez une option : ");
            enclosureChoice = scanner.nextInt();

            switch (enclosureChoice) {
                case 1:
                    // Ajouter la logique pour afficher les enclos
                    Enclosure.displayEnclosure();
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

    void runCreatureMenu() {

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

        int creatureChoice;

        do {
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
                    boolean type = false;

                    name = nameCreature();
                    type = typeCreature();
                    weight = weightCreature();
                    height = heightCreature();
                    age = ageCreature();
                    health = healthCreature();

                    Dragon newDragon = new Dragon(name, "Dragon", type, weight, height, age, health, "Cri du Dragon");

                    addCreature(newDragon);

                    Thread creatureThread = new Thread(newDragon);
                    creatureThreads.add(creatureThread);
                    enclosParDefaut.addCreature(newDragon);
                    creatureThread.start();

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

    public void addCreatureThread(Thread creatureThread) {
        creatureThreads.add(creatureThread);
    }

    public List<Thread> getCreatureThreads() {
        return creatureThreads;
    }

    public void closeScanner() {
        // scanner.close();
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

}