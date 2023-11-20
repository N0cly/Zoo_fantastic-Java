package org.example;

public interface Fly {

    public default String fly(Creature creature) {
        if (creature.isAlive()) {
            return creature.getName() + " est en train de voler";
        } else {
            return creature.getName() + " est mort";
        }
    }
}
