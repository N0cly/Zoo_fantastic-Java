package org.example.interfaces;

import org.example.Creature;

public interface Fly {

    public default String fly(Creature creature) {
        if (creature.isAlive()) {
            return creature.getName() + " est en train de voler";
        } else {
            return creature.getName() + " est mort";
        }
    }
}
