package org.example;

public interface run {

    public default String run(String name, boolean isAlive){
        if (isAlive) {
            return name + " est en train de courir";
        } else {
            return name + " est mort";
        }
    }
}
