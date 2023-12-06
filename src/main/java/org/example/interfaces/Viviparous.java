package org.example.interfaces;

import org.example.Creature;

public interface Viviparous {

    public default String giveBirth(Creature creature){
        if (!creature.isAlive()) {
            return creature.getName() + " est mort";
        } else if ("femmelle".equalsIgnoreCase(creature.getGender())) {
            return creature.getName() + " est en train d'accoucher";
        } else {
            return creature.getName() + " est un male, il ne peut pas accoucher";
        }
    }
}
