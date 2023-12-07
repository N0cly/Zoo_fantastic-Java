package org.example;

/**
 * Represents a zookeeper responsible for managing enclosures and creatures in a zoo.
 */
public class ZooKeeper {

    private String name;
    private String gender;
    private int age;

    /**
     * Constructs a zookeeper with the specified name, gender, and age.
     *
     * @param name   The name of the zookeeper.
     * @param gender The gender of the zookeeper.
     * @param age    The age of the zookeeper.
     */
    public ZooKeeper(String name, String gender, int age) {
        this.name = name;
        this.gender = String.valueOf(gender);
        this.age = age;
    }

    /**
     * Examines an enclosure and displays its information.
     *
     * @param enclosure The enclosure to be examined.
     */
    public void examineEnclosure(Enclosure enclosure) {
        System.out.println("Examen de l'enclos : " + enclosure.getName());
        enclosure.displayInfo();
    }

    /**
     * Cleans an enclosure, setting its cleanliness state to "BON" (good).
     *
     * @param enclosure The enclosure to be cleaned.
     */
    public void cleanEnclosure(Enclosure enclosure) {
        enclosure.setCleanliness(Cleanliness.BON);
        System.out.println("L'enclos " + enclosure.getName() + " a été nettoyé.");
    }

    /**
     * Feeds the creatures in an enclosure.
     *
     * @param enclosure The enclosure containing creatures to be fed.
     */
    public void feedCreaturesInEnclosure(Enclosure enclosure) {
        enclosure.feedCreatures();
        System.out.println("Les créatures de l'enclos " + enclosure.getName() + " ont été nourries.");
    }

    /**
     * Transfers a creature from one enclosure to another.
     *
     * @param creature       The creature to be transferred.
     * @param fromEnclosure  The enclosure from which the creature is transferred.
     * @param toEnclosure    The enclosure to which the creature is transferred.
     */
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
