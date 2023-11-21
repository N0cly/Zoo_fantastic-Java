package org.example;

import java.util.List;

public class Aviary extends Enclosure {

    public Aviary(String name, double area, int maxCapacity, List<Creature> creatures, Cleanliness cleanliness) {
        super(name, area, maxCapacity, creatures, cleanliness);
    }
}
