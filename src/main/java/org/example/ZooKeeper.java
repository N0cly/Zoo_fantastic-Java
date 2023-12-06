package org.example;

public class ZooKeeper {
    private String name;
    private String gender;
    private int age;

    public ZooKeeper(String name, String gender, int age) {
        this.name = name;
        this.gender = String.valueOf(gender);
        this.age = age;
    }
    // Examiner un enclos
    public void examineEnclosure(Enclosure enclosure) {
        System.out.println("Examen de l'enclos : " + enclosure.getName());
        enclosure.displayInfo();
    }
    // Nettoyer un enclos
    public void cleanEnclosure(Enclosure enclosure) {
        enclosure.setCleanliness(Cleanliness.BON);
        System.out.println("L'enclos " + enclosure.getName() + " a été nettoyé.");
    }
    // Nourrir les créatures d'un enclos
    public void feedCreaturesInEnclosure(Enclosure enclosure) {
        enclosure.feedCreatures();
        System.out.println("Les créatures de l'enclos " + enclosure.getName() + " ont été nourries.");
    }
    // Transférer une créature d'un enclos à un autre
    public void transferCreature(Creature creature, Enclosure fromEnclosure, Enclosure toEnclosure) {
        if (fromEnclosure.getCreatures().contains(creature) && toEnclosure.getNumberOfCreatures() < toEnclosure.getMaxCapacity()) {
            fromEnclosure.removeCreature(creature);
            toEnclosure.addCreature(creature);
            System.out.println("La créature a été transférée de " + fromEnclosure.getName() + " à " + toEnclosure.getName() + ".");
        } else {
            System.out.println("Le transfert de la créature n'est pas possible.");
        }
    }
}
