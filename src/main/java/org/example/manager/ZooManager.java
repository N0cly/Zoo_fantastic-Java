package org.example.manager;

import org.example.Zoo;
import java.util.Scanner;

import static java.lang.Thread.sleep;

/**
 * Cette classe gère la création d'un zoo fantastique.
 */
public class ZooManager {

    private Zoo zoo = null;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Demande et renvoie le nom du zoo saisi par l'utilisateur.
     *
     * @return Le nom du zoo.
     */
    public static String setName() {
        System.out.print("Nom du zoo : ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty() || name.isBlank()) {
            System.out.println("Il faut donner un nom au zoo !");
            System.out.print("Nom du zoo : ");
            name = scanner.nextLine().trim();
        }
        System.out.println("Nom du zoo : " + name);
        return name;
    }

    /**
     * Demande et renvoie le nombre maximum d'enclos saisi par l'utilisateur.
     *
     * @return Le nombre maximum d'enclos.
     */
    private static int setMaxEnclosures() {
        System.out.print("Nombre maximum d'enclos (defaut = 10) : ");
        String maxEnclosuresInput = scanner.nextLine().trim();
        if (!maxEnclosuresInput.isEmpty()) {
            while (!isNumeric(maxEnclosuresInput)) {
                System.out.println("Veuillez entrer un nombre entier.");
                System.out.print("Nombre maximum d'enclos (defaut = 10) : ");
                maxEnclosuresInput = scanner.nextLine().trim();
            }
            System.out.println("Nombre maximum d'enclos : " + maxEnclosuresInput);
            return Integer.parseInt(maxEnclosuresInput);
        }
        System.out.println("Nombre maximum d'enclos par défaut : 10");
        return 10;
    }

    /**
     * Vérifie si la chaîne donnée est numérique.
     *
     * @param str La chaîne à vérifier.
     * @return true si la chaîne est numérique, sinon false.
     */
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    /**
     * Affiche le menu principal du zoo fantastique.
     */
    public void displayMainMenu(Zoo zoo) {
        System.out.println("===== Bienvenue chez le Zoo " + zoo.getName() + " =====");
        System.out.println("1. Gérer les créatures");
        System.out.println("2. Gérer les enclos");
        System.out.println("3. Simuler le passage du temps");
        System.out.println("4. Quitter");
        System.out.print("Choisissez une option : ");
    }

    /**
     * Affiche le menu de création du zoo fantastique.
     * 
     * @return
     *
     * @throws InterruptedException
     */

    public Zoo displayZooCreationMenu() throws InterruptedException {
        int creatureChoice;

        do {
            System.out.println("===== Zoo Fantastique =====");
            System.out.println("Bienvenue dans le Zoo Fantastique !");
            System.out.println("Dans un premier temps, vous allez créer un zoo");
            System.out.println("1. Créer un zoo");
            System.out.println("2. Quitter");
            System.out.print("Choisissez une option : ");

            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre entier.");
                scanner.next(); // Consommer l'entrée incorrecte
            }

            creatureChoice = scanner.nextInt();
            scanner.nextLine(); // Lire la ligne vide après la saisie du nombre

            switch (creatureChoice) {
                case 1:
                    System.out.println("Ajout d'un zoo...");

                    String name = setName();
                    int maxEnclosures = setMaxEnclosures();

                    Zoo newZoo = new Zoo(name, maxEnclosures);

                    System.out.println("Zoo ajouté avec succès !");
                    return newZoo;
                case 2:
                    System.out.println("Aurevoir !");
                    System.exit(0); // 0 indique une sortie normale
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }

        } while (creatureChoice != 2);

        // Si l'utilisateur choisit l'option 2, retourne null
        return null;
    }
}
