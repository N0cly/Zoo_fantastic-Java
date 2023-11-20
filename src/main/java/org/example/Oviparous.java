package org.example;

public interface Oviparous {

    public default String oviparous(Creature creature) {
        if (creature.isAlive() && !creature.getType()) {
            return creature.getName() + " pond des oeufs";
        } else if (creature.isAlive() && creature.getType()) {
            return creature.getName() + " est un male, il ne peut pas pondre";
        }
        return creature.getName() + " est mort(e)";
    }
}
