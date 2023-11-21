package org.example;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

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
