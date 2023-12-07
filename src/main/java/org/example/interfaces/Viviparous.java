package org.example.interfaces;

import org.example.Creature;

/**
 * L'interface Viviparous est destinée à être implémentée par des créatures vivipares.
 * Elle fournit une méthode par défaut pour représenter l'action de donner naissance.
 */
public interface Viviparous {

    /**
     * Méthode par défaut représentant l'action de donner naissance.
     *
     * @param creature La créature vivipare.
     * @return Une chaîne de caractères décrivant l'action de donner naissance de la créature.
     */
    default String giveBirth(Creature creature){
        if (!creature.isAlive()) {
            return creature.getName() + " est mort";
        } else if ("femmelle".equalsIgnoreCase(creature.getGender())) {
            return creature.getName() + " est en train d'accoucher";
        } else {
            return creature.getName() + " est un mâle, il ne peut pas accoucher";
        }
    }
}
