package org.example;

public interface swim {

    public default String swim(String name, boolean isAlive){
        if (isAlive) {
            return name + " est en train de nager";
        } else {
            return name + " est mort";
        }
    };
}
