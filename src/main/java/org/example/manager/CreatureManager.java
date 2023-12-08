package org.example.manager;

import org.example.Creature;
import org.example.Enclosure;
import org.example.Zoo;
import org.example.ZooKeeper;
import org.example.creatures.*;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Cette classe gère les créatures et les opérations associées dans le zoo
 * fantastique.
 */
public class CreatureManager {
    private static List<Creature> creatures = new ArrayList<>();
    private static List<Thread> creatureThreads = new ArrayList<>();
    private static Enclosure enclosParDefaut;
    static Zoo zoo;
    public static ZooManager zooManager = new ZooManager();

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Constructeur de la classe CreatureManager.
     *
     * @param enclosParDefaut L'enclos par défaut dans le zoo fantastique.
     */
    public CreatureManager(Enclosure enclosParDefaut) {
        CreatureManager.enclosParDefaut = enclosParDefaut;
        CreatureManager.creatures = new ArrayList<>();
        CreatureManager.creatureThreads = new ArrayList<>();
    }

    /**
     * Ajoute une créature à la liste et démarre un thread pour la créature.
     *
     * @param creature La créature à ajouter.
     */
    public static void addCreature(Creature creature) {
        creatures.add(creature);

        Thread creatureThread = new Thread(creature);
        creatureThreads.add(creatureThread);
        creatureThread.start();
    }

    /**
     * Renvoie la liste des créatures.
     *
     * @return La liste des créatures.
     */
    public List<Creature> getCreatures() {
        return creatures;
    }

    /**
     * Affiche la liste des créatures avec leur nom et leur niveau de faim.
     */
    public void displayCreatures() {
        System.out.println("===== Liste des Créatures =====");

        if (creatures != null) {
            for (Creature creature : creatures) {
                System.out.println("Name : " + creature.getName() + " | " + "Hunger : " + creature.getHunger());
            }
        } else {
            System.out.println("La liste de créatures est nulle.");
        }
    }

    /**
     * Supprime une créature de la liste.
     *
     * @param creature La créature à supprimer.
     */
    public void removeCreature(Creature creature) {
        creatures.remove(creature);
    }

    public void removeCreatureFromEnclosure(Enclosure enclosure) {
        if (!enclosure.getCreatures().isEmpty()) {
            System.out.print("Choisissez le numéro de la créature à retirer : ");
            int creatureIndex = scanner.nextInt();

            if (creatureIndex >= 1 && creatureIndex <= enclosure.getNumberOfCreatures()) {
                Creature creatureToRemove = enclosure.getCreatures().get(creatureIndex - 1);
                enclosure.removeCreature(creatureToRemove); // Utilise la fonction d'Enclosure pour retirer la créature
                System.out.println(creatureToRemove.getName() + " a été retiré de l'enclos.");
            } else {
                System.out.println("Numéro de créature invalide.");
            }
        } else {
            System.out.println("Aucune créature présente dans l'enclos.");
        }
    }

    /**
     * Demande et renvoie le nom de la créature saisi par l'utilisateur.
     *
     * @return Le nom de la créature.
     */
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

    /**
     * Demande et renvoie le type de la créature saisi par l'utilisateur.
     *
     * @return Le type de la créature.
     */
    public static String setType() {
        System.out.print("Male(M) ou Femelle(F) (defaut F): ");
        String stype = scanner.nextLine().trim();
        if (!stype.isEmpty()) {
            while (!stype.equals("M") || !stype.equals("F") || !stype.equals("")) {
                System.out.println("Caractere saisi incorrect");
                System.out.print("Male(M) ou Femelle(F) (defaut F): ");
                stype = scanner.nextLine().trim();
                if ("M".equals(stype)) {
                    System.out.println("Type : Male");
                    return "Male";
                } else if ("F".equals(stype)) {
                    System.out.println("Type : Femelle");
                    return "Femelle";
                }
            }
        }
        if ("M".equals(stype)) {
            System.out.println("Type : Male");
            return "Male";
        } else if ("F".equals(stype)) {
            System.out.println("Type : Femelle");
            return "Femelle";
        }
        System.out.println("Type par défaut : Femelle");
        return "Femelle";
    }

    /**
     * Demande et renvoie le poids de la créature saisi par l'utilisateur.
     *
     * @return Le poids de la créature.
     */
    public static int setWeight() {
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

    /**
     * Demande et renvoie la taille de la créature saisi par l'utilisateur.
     *
     * @return La taille de la créature.
     */
    public static int setHeight() {
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

    /**
     * Demande et renvoie l'âge de la créature saisi par l'utilisateur.
     *
     * @return L'âge de la créature.
     */
    public static int setAge() {
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

    /**
     * Demande et renvoie la santé de la créature saisi par l'utilisateur.
     *
     * @return La santé de la créature.
     */
    public static int setHealth() {
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

    public static String setCries() {
        System.out.print("Cri de la créature (defaut = Grr Grr) : ");
        String criesInput = scanner.nextLine().trim();
        if (!criesInput.isEmpty()) {
            System.out.println("Cri : " + criesInput);
            return criesInput;
        }
        System.out.println("Cri par défaut : Grr Grr");
        return "Grr Grr";
    }

    /**
     * Ajoute une créature en fonction de l'entrée utilisateur.
     */
    public void addCreatureFromUserInput() {
        int creatureChoice;

        do {
            System.out.println("Quelle créature souhaitez-vous créer? ");
            zooManager.afficherMenuCreationCreature();

            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre entier.");
                scanner.next(); // Consommer l'entrée incorrecte
            }

            creatureChoice = scanner.nextInt();
            scanner.nextLine(); // Lire la ligne vide après la saisie du nombre

            switch (creatureChoice) {
                case 1:
                    // Création d'un dragon...
                    int healthDragon = 100;
                    int ageDragon = 10;
                    int heightDragon = 110;
                    int weightDragon = 80;
                    String nameDragon = "name";
                    String typeDragon = "Femelle";

                    nameDragon = setName();
                    typeDragon = setType();
                    weightDragon = setWeight();
                    heightDragon = setHeight();
                    ageDragon = setAge();
                    healthDragon = setHealth();

                    Dragon newDragon = new Dragon(nameDragon, typeDragon, weightDragon, heightDragon, ageDragon, healthDragon, "Grr Grr");

                    // Ajout de la créature à un enclos
                    zooManager.addCreatureToEnclosure(newDragon);

                    addCreature(newDragon);

                    System.out.println(nameDragon + " ajouté avec succès !");
                    break;
                case 2:
                    // Création d'un kraken
                    System.out.println("Création d'un kraken...");

                    int healthKraken = 100;
                    int ageKraken = 10;
                    int heightKraken = 110;
                    int weightKraken = 80;
                    String nameKraken = "name";
                    String typeKraken = "Femelle";
                    String criesKraken = "Grr Grr";

                    nameKraken = setName();
                    typeKraken = setType();
                    weightKraken = setWeight();
                    heightKraken = setHeight();
                    ageKraken = setAge();
                    healthKraken = setHealth();
                    criesKraken = setCries();

                    Kraken kraken = new Kraken(nameKraken, typeKraken, weightKraken, heightKraken, ageKraken, healthKraken, criesKraken);

                    zooManager.addCreatureToEnclosure(kraken);

                    addCreature(kraken);

                    System.out.println(nameKraken + " ajouté avec succès !");
                    break;
                case 3:
                    // creation d'un lycanhropes
                    System.out.println("Création d'un lycanhropes...");

                    int healthLycanhropes = 100;
                    int ageLycanhropes = 10;
                    int heightLycanhropes = 110;
                    int weightLycanhropes = 80;
                    String nameLycanhropes = "name";
                    String typeLycanhropes = "Femelle";
                    String criesLycanhropes = "Grr Grr";

                    nameLycanhropes = setName();
                    typeLycanhropes = setType();
                    weightLycanhropes = setWeight();
                    heightLycanhropes = setHeight();
                    ageLycanhropes = setAge();
                    healthLycanhropes = setHealth();
                    criesLycanhropes = setCries();

                    Lycanthrope lycanhropes = new Lycanthrope(nameLycanhropes, typeLycanhropes, weightLycanhropes, heightLycanhropes, ageLycanhropes, healthLycanhropes, criesLycanhropes);

                    zooManager.addCreatureToEnclosure(lycanhropes);

                    addCreature(lycanhropes);

                    System.out.println(nameLycanhropes + " ajouté avec succès !");
                    break;

                case 4:
                    //creation d'un megalodon
                    System.out.println("Création d'un megalodon...");

                    int healthMegalodon = 100;
                    int ageMegalodon = 10;
                    int heightMegalodon = 110;
                    int weightMegalodon = 80;
                    String nameMegalodon = "name";
                    String typeMegalodon = "Femelle";
                    String criesMegalodon = "Grr Grr";

                    nameMegalodon = setName();
                    typeMegalodon = setType();
                    weightMegalodon = setWeight();
                    heightMegalodon = setHeight();
                    ageMegalodon = setAge();
                    healthMegalodon = setHealth();
                    criesMegalodon = setCries();

                    Megalodons megalodon = new Megalodons(nameMegalodon, typeMegalodon, weightMegalodon, heightMegalodon, ageMegalodon, healthMegalodon, criesMegalodon);

                    zooManager.addCreatureToEnclosure(megalodon);

                    addCreature(megalodon);

                    System.out.println(nameMegalodon + " ajouté avec succès !");
                    break;
                case 5:
                    //creation d'un mermaid
                    System.out.println("Création d'un mermaid...");

                    int healthMermaid = 100;
                    int ageMermaid = 10;
                    int heightMermaid = 110;
                    int weightMermaid = 80;
                    String nameMermaid = "name";
                    String typeMermaid = "Femelle";
                    String criesMermaid = "Grr Grr";

                    nameMermaid = setName();
                    typeMermaid = setType();
                    weightMermaid = setWeight();
                    heightMermaid = setHeight();
                    ageMermaid = setAge();
                    healthMermaid = setHealth();
                    criesMermaid = setCries();

                    Megalodons mermaid = new Megalodons(nameMermaid, typeMermaid, weightMermaid, heightMermaid, ageMermaid, healthMermaid, criesMermaid);

                    zooManager.addCreatureToEnclosure(mermaid);

                    addCreature(mermaid);

                    System.out.println(nameMermaid + " ajouté avec succès !");
                    break;
                case 6:
                    //creation d'un phoenix
                    System.out.println("Création d'un phoenix...");

                    int healthPhoenix = 100;
                    int agePhoenix = 10;
                    int heightPhoenix = 110;
                    int weightPhoenix = 80;
                    String namePhoenix = "name";
                    String typePhoenix = "Femelle";
                    String criesPhoenix = "Grr Grr";

                    namePhoenix = setName();
                    typePhoenix = setType();
                    weightPhoenix = setWeight();
                    heightPhoenix = setHeight();
                    agePhoenix = setAge();
                    healthPhoenix = setHealth();
                    criesPhoenix = setCries();

                    Phenix phoenix = new Phenix(namePhoenix, typePhoenix, weightPhoenix, heightPhoenix, agePhoenix, healthPhoenix, criesPhoenix);

                    zooManager.addCreatureToEnclosure(phoenix);

                    addCreature(phoenix);

                    System.out.println(namePhoenix + " ajouté avec succès !");
                    break;
                case 7:
                    //creation unicorn

                    System.out.println("Création d'un unicorn...");

                    int healthUnicorn = 100;
                    int ageUnicorn = 10;
                    int heightUnicorn = 110;
                    int weightUnicorn = 80;
                    String nameUnicorn = "name";
                    String typeUnicorn = "Femelle";
                    String criesUnicorn = "Grr Grr";

                    nameUnicorn = setName();
                    typeUnicorn = setType();
                    weightUnicorn = setWeight();
                    heightUnicorn = setHeight();
                    ageUnicorn = setAge();
                    healthUnicorn = setHealth();
                    criesUnicorn = setCries();

                    Unicorn unicorn = new Unicorn(nameUnicorn, typeUnicorn, weightUnicorn, heightUnicorn, ageUnicorn, healthUnicorn, criesUnicorn);

                    zooManager.addCreatureToEnclosure(unicorn);

                    addCreature(unicorn);

                    System.out.println(nameUnicorn + " ajouté avec succès !");
                    break;
                case 8:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
            }

            if (creatureChoice == 8) {
                break;
            }
        } while (creatureChoice != 8);
    }

    /**
     * Ajoute un thread pour la créature.
     *
     * @param creatureThread Le thread de la créature.
     */
    public void addCreatureThread(Thread creatureThread) {
        creatureThreads.add(creatureThread);
    }

    /**
     * Renvoie la liste des threads des créatures.
     *
     * @return La liste des threads des créatures.
     */
    public List<Thread> getCreatureThreads() {
        return creatureThreads;
    }

    /**
     * Ferme le scanner.
     */
    public void closeScanner() {
        // scanner.close();
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

    public Scanner getScanner() {
        return scanner;
    }
}
