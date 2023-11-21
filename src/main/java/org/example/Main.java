package org.example;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Phenix phenix = new Phenix("Phenix", true, 110, 110, 0, 100, false, 0, null);
    private static Enclosure enclos = new Enclosure("Enclos 1", 100, 3);

    public static void main(String[] args) {
        int mainChoice;

        do {
            CreatureManager.displayMainMenu();
            mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    CreatureManager.runCreatureMenu();
                    break;
                case 2:
                    CreatureManager.runEnclosureMenu();
                    break;
                case 3:
                    // Ajouter la logique pour simuler le passage du temps
                    System.out.println("Simulation du passage du temps...");
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }
        } while (mainChoice != 4);
    }
}
