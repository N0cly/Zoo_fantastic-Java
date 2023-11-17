package org.example;

public interface fly {

    public default String fly(String name, boolean isAlive) {
        if (isAlive) {
            return name + " est en train de voler";
        } else {
            return name + " est mort";
        }
    }
}
