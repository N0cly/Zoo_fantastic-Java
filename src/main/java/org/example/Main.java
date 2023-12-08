package org.example;

import org.example.manager.CreatureManager;
import org.example.manager.ZooManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Thread> creatureThreads = new ArrayList<>();
    static Enclosure sansEnclos = new Enclosure("Sans Enclos", 150, 4, Cleanliness.BON);
    static List<Enclosure> enclosureList = new ArrayList<>();
    static CreatureManager creatureManager = new CreatureManager(sansEnclos);
    public static ZooManager zooManager = new ZooManager();
    static Zoo zoo = null;

    public static void main(String[] args) throws InterruptedException {
        int mainChoice;
        zoo = zooManager.displayZooCreationMenu();
        System.out.println("Maintenant, creez un nouvel enclos dans votre zoo");
        zooManager.addEnclosure();

        do {
            if (zoo != null) { // Check if zoo is not null

                zooManager.displayMainMenu(zoo);
                mainChoice = scanner.nextInt();

                switch (mainChoice) {
                    case 1:
                        zooManager.runCreatureMenu();
                        break;
                    case 2:
                        zooManager.runEnclosureMenu();
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
            } else {
                // Handle null zoo
                System.out.println("Zoo non créé. Veuillez créer un zoo avant de choisir d'autres options.");
                mainChoice = 1; // Setting a default value to continue the loop
            }
        } while (mainChoice != 4);
        creatureManager.closeScanner();
        System.exit(0); // 0 indique une sortie normale
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
