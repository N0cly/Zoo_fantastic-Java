package org.example;

public interface Viviparous {


    public default String viviparous(String name, Boolean type, boolean isAlive){
        if (isAlive && !type) {
            return name + " est en train d'accoucher";
        } else if (isAlive && type) {
            return name + " est un male, il ne peut pas accoucher";
        }
        return name + " est mort";
    }
}
