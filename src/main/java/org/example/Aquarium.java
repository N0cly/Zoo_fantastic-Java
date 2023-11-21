package org.example;

import java.util.List;

public class Aquarium extends Enclosure {
    public Aquarium(String name, double area, int maxCapacity, List<Creature> creatures, Cleanliness cleanliness) {
        super(name, area, maxCapacity, creatures, cleanliness);
    }
}
