package org.example;

public interface swim {

    public default String swim(String name){
        return name + " est en train de nager";
    }
}
