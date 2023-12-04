package org.example.interfaces;

import org.example.Creature;

public interface Resurrect {

    public default String resurrect(Creature creature) {
        if (!creature.isAlive()) {
            return creature.getName() + " est en train de ressusciter";

        } else {
            return creature.getName() + " est vivant";
        }
    }
}
