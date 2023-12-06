package org.example.interfaces;

import org.example.Creature;

public interface Oviparous {

    public default String oviparous(Creature creature) {
        if (!creature.isAlive()) {
            return creature.getName() + " est mort(e)";
        } else if ("femmelle".equalsIgnoreCase(creature.getGender())) {
            return creature.getName() + " pond des oeufs";
        } else {
            return creature.getName() + " est un male, il ne peut pas pondre";
        }
    }
}
