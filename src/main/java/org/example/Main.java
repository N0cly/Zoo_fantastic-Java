package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Thread> creatureThreads = new ArrayList<>();
    static CreatureManager creatureManager = new CreatureManager();

    public static void main(String[] args) {
        int mainChoice;
        do {
            CreatureManager.displayMainMenu();
            mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    creatureManager.runCreatureMenu();
                    break;
                case 2:
                    creatureManager.runEnclosureMenu();
                    break;
                case 3:
                    // Ajouter la logique pour simuler le passage du temps
                    System.out.println("Simulation du passage du temps...");
                    startCreatureThreads(); // Démarrer les threads des créatures
                    break;
                case 4:
                    stopCreatureThreads(); // Arrêter les threads des créatures avant de quitter
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }
        } while (mainChoice != 4);
        creatureManager.closeScanner();
    }

    private static void startCreatureThreads() {
        for (Creature creature : creatureManager.getCreatures()) {
            Thread creatureThread = new Thread(creature);
            creatureThreads.add(creatureThread);
            creatureThread.start();
        }
    }

    private static void stopCreatureThreads() {
        for (Thread thread : creatureThreads) {
            thread.interrupt();
        }
    }
}
