package org.example;

public interface Run {

    public default String run(Creature creature){
        if (creature.isAlive()) {
            return creature.getName() + " est en train de courir";
        } else {
            return creature.getName() + " est mort";
        }
    }
}
