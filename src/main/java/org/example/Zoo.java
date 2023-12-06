package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private int maxEnclosures;
    private List<Enclosure> enclosures;

    public Zoo(String name, int maxEnclosures) {
        this.name = name;
        this.zooKeeper = null;
        this.maxEnclosures = maxEnclosures;
        this.enclosures = new ArrayList<>();
    }
    // Affiche le nombre total de créatures dans le zoo
    public void displayTotalNumberOfCreatures() {
        int total = 0;
        for (Enclosure enclosure : enclosures) {
            total += enclosure.getNumberOfCreatures();
        }
        System.out.println("Nombre total de créatures dans le zoo: " + total);
    }

    // Affiche les créatures dans tous les enclos
    public void displayCreaturesInAllEnclosures() {
        for (Enclosure enclosure : enclosures) {
            System.out.println("Enclos: " + enclosure.getName());
            enclosure.displayInfo();
        }
    }

    // Applique des événements aléatoires dans le zoo
    public void applyRandomEvents() {
        Random random = new Random();
        for (Enclosure enclosure : enclosures) {
            for (Creature creature : enclosure.getCreatures()) {
                // Endormir ou réveiller les créatures aléatoirement
                if (random.nextBoolean()) {
                    creature.sleep();
                } else {
                    creature.wake();
                }

                // Modifier aléatoirement la santé des créatures
                if (random.nextBoolean()) {
                    creature.heal(); // Guérir la créature
                }

                // Nourrir la créature aléatoirement
                if (random.nextBoolean()) {
                    creature.eat(); // Nourrir la créature
                }

                // Vieillir la créature aléatoirement
                if (random.nextBoolean()) {
                    creature.old(); // Vieillir la créature
                }
            }

            // Modifier aléatoirement l'état des enclos
            if (random.nextBoolean()) {
                enclosure.setCleanliness(Cleanliness.values()[random.nextInt(Cleanliness.values().length)]);
            }
        }
    }
}
