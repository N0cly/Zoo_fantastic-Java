package org.example;

public interface fly {

    public default String fly(String name){
        return name + " est en train de voler";
    }
}
