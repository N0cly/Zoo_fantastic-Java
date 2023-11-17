package org.example;

public interface viviparous {


    public default String giveBirth(String name, Boolean type, boolean isAlive){
        if (isAlive && !type) {
            return name + " est en train d'accoucher";
        } else {
            return name + " est mort";
        }
    }
}
