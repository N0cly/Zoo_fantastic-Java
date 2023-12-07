package org.example.manager;

import org.example.Zoo;
import java.util.Scanner;


import static java.lang.Thread.sleep;

public class ZooManager {

    private static Scanner scanner = new Scanner(System.in);

    public static String setName() {
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

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void displayZooCreationMenu() throws InterruptedException {
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

                    String name = "name";
                    int maxEnclosures = 10;


                    name = setName();
                    maxEnclosures = setMaxEnclosures();

                    Zoo newZoo = new Zoo(name, maxEnclosures);

                    System.out.println("Zoo ajouté avec succès !");
                    sleep(2000);

                    break;
                case 2:
                    System.out.println("Aurevoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }

            if (creatureChoice == 2) {
                break;
            }
        } while (creatureChoice != 2);
    }
}
