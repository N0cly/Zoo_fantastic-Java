package org.example.interfaces;

import org.example.Creature;

/**
 * L'interface Run est destinée à être implémentée par des créatures capables de courir.
 * Elle fournit une méthode par défaut pour représenter l'action de courir.
 */
public interface Run {

    /**
     * Méthode par défaut représentant l'action de courir.
     *
     * @param creature La créature qui court.
     * @return Une chaîne de caractères décrivant l'action de courir de la créature.
     */
    default String run(Creature creature){
        if (creature.isAlive()) {
            return creature.getName() + " est en train de courir";
        } else {
            return creature.getName() + " est mort";
        }
    }
}
