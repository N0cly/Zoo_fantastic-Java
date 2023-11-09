package org.example;

public interface run {

    public default String run(String name){
        return name + " est en train de courir";
    }
}
