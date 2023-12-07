package org.example.interfaces;

import org.example.Creature;

/**
 * L'interface Oviparous est destinée à être implémentée par des créatures ovipares.
 * Elle fournit une méthode par défaut pour représenter l'action liée à la reproduction par œufs.
 */
public interface Oviparous {

    /**
     * Méthode par défaut représentant l'action liée à la reproduction par œufs.
     *
     * @param creature La créature ovipare.
     * @return Une chaîne de caractères décrivant l'action liée à la reproduction par œufs de la créature.
     */
    default String oviparous(Creature creature) {
        if (!creature.isAlive()) {
            return creature.getName() + " est mort(e)";
        } else if ("femmelle".equalsIgnoreCase(creature.getGender())) {
            return creature.getName() + " pond des œufs";
        } else {
            return creature.getName() + " est un mâle, il ne peut pas pondre";
        }
    }
}
