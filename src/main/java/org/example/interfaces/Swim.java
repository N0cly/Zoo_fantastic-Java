package org.example.interfaces;

import org.example.Creature;

public interface Swim {

    public default String swim(Creature creature) {
        if (creature.isAlive()) {
            return creature.getName() + " est en train de nager";
        } else {
            return creature.getName() + " est mort";
        }
    };
}