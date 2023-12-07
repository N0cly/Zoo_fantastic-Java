package org.example.interfaces;

import org.example.Creature;

/**
 * L'interface Swim est destinée à être implémentée par des créatures capables de nager.
 * Elle fournit une méthode par défaut pour représenter l'action de nager.
 */
public interface Swim {

    /**
     * Méthode par défaut représentant l'action de nager.
     *
     * @param creature La créature qui nage.
     * @return Une chaîne de caractères décrivant l'action de nager de la créature.
     */
    default String swim(Creature creature) {
        if (creature.isAlive()) {
            return creature.getName() + " est en train de nager";
        } else {
            return creature.getName() + " est mort";
        }
    }
}
