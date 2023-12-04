package org.example.interfaces;

import org.example.Creature;

public interface Viviparous {

    public default String viviparous(Creature creature){
        if (creature.isAlive() && !creature.getType()) {
            return creature.getName() + " est en train d'accoucher";
        } else if (creature.isAlive() && creature.getType()) {
            return creature.getName() + " est un male, il ne peut pas accoucher";
        }
        return creature.getName() + " est mort";
    }
}
