package org.example;

public interface Oviparous {

    public default String oviparous(String name, Boolean type, boolean isAlive){
        if (isAlive && !type) {
            return name + " est en train de pondre";
        } else if (isAlive && type) {
            return name + " est un male, il ne peut pas pondre";
        }
        return name + " est mort(e)";
    }
}
