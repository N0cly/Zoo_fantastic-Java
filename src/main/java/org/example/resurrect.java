package org.example;

public interface resurrect {

    public default String resurrect(Creature creature) {
        if (!creature.isAlive()) {
            return creature.getName() + " est en train de ressusciter";

        } else {
            return creature.getName() + " est vivant";
        }
    }
}
