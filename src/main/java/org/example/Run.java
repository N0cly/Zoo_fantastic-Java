package org.example;

public interface Run {

    public default String run(String name, boolean isAlive){
        if (isAlive) {
            return name + " est en train de courir";
        } else {
            return name + " est mort";
        }
    }
}
