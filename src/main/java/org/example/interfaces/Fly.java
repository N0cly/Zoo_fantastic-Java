package org.example.interfaces;

import org.example.Creature;

/**
 * L'interface Fly est destinée à être implémentée par des créatures capables de voler.
 * Elle fournit une méthode par défaut pour représenter l'action de voler.
 */
public interface Fly {

    /**
     * Méthode par défaut représentant l'action de voler.
     *
     * @param creature La créature qui vole.
     * @return Une chaîne de caractères décrivant l'action de voler de la créature.
     */
    default String fly(Creature creature) {
        if (creature.isAlive()) {
            return creature.getName() + " est en train de voler";
        } else {
            return creature.getName() + " est mort";
        }
    }
}
