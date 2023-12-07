package org.example.interfaces;

import org.example.Creature;

/**
 * L'interface Resurrect est destinée à être implémentée par des créatures capables de ressusciter.
 * Elle fournit une méthode par défaut pour représenter l'action de résurrection.
 */
public interface Resurrect {

    /**
     * Méthode par défaut représentant l'action de résurrection.
     *
     * @param creature La créature susceptible de ressusciter.
     * @return Une chaîne de caractères décrivant l'action de résurrection de la créature.
     */
    default String resurrect(Creature creature) {
        if (!creature.isAlive()) {
            return creature.getName() + " est en train de ressusciter";
        } else {
            return creature.getName() + " est vivant";
        }
    }
}
