package org.example.manager;

import org.example.Creature;
import org.example.Enclosure;
import org.example.Cleanliness;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CreatureManagerTest {

    @Test
    void addCreature() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);

        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        assertTrue(creatureManager.getCreatures().contains(creature));
    }

    @Test
    void getCreatures() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature1 = new Creature("Creature1", "Female", 40, 60, 4, 90, "Growl");
        Creature creature2 = new Creature("Creature2", "Male", 55, 75, 6, 80, "Hiss");

        creatureManager.addCreature(creature1);
        creatureManager.addCreature(creature2);

        List<Creature> creatures = creatureManager.getCreatures();
        assertEquals(2, creatures.size());
        assertTrue(creatures.contains(creature1));
        assertTrue(creatures.contains(creature2));
    }


    @Test
    void removeCreature() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        assertTrue(creatureManager.getCreatures().contains(creature));

        creatureManager.removeCreature(creature);
        assertFalse(creatureManager.getCreatures().contains(creature));
    }

    @Test
    void removeCreatureFromEnclosure() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        enclosure.addCreature(creature);

        assertTrue(enclosure.getCreatures().contains(creature));

        creatureManager.removeCreatureFromEnclosure(enclosure);
        assertFalse(enclosure.getCreatures().contains(creature));
    }

    @Test
    void setName() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        creatureManager.setName();
        Scanner scanner = creatureManager.getScanner();
        assertEquals("NewName", creature.getName());
    }

    @Test
    void setType() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        creatureManager.setType();
        assertEquals("Female", creature.getGender());
    }

    @Test
    void setWeight() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        creatureManager.setWeight();
        assertEquals(60, creature.getWeight());
    }

    @Test
    void setHeight() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        creatureManager.setHeight();
        assertEquals(80, creature.getHeight());
    }

    @Test
    void setAge() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        creatureManager.setAge();
        assertEquals(6, creature.getAge());
    }

    @Test
    void setHealth() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        creatureManager.setHealth();
        assertEquals(80, creature.getHealth());
    }

    @Test
    void setCries() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        creatureManager.addCreature(creature);

        creatureManager.setCries();
        assertEquals("Growl", creature.getCries());
    }

    @Test
    void addCreatureFromUserInput() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);

        // Mocking user input for testing
        String input = "TestCreature\nMale\n50\n70\n5\n100\nRoar\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        creatureManager.addCreatureFromUserInput();

        List<Creature> creatures = creatureManager.getCreatures();
        assertEquals(1, creatures.size());
        assertEquals("TestCreature", creatures.get(0).getName());

        // Reset System.in
        System.setIn(System.in);
    }

    @Test
    void addCreatureThread() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);

        Creature creature = new Creature("TestCreature", "Male", 50, 70, 5, 100, "Roar");
        Thread creatureThread = new Thread(creature);
        creatureThread.start();
        creatureManager.addCreatureThread(creatureThread);

        List<Thread> creatureThreads = creatureManager.getCreatureThreads();
        assertEquals(1, creatureThreads.size());
    }

    @Test
    void closeScanner() {
        Enclosure enclosure = new Enclosure("TestEnclosure", 100, 5, Cleanliness.BON);
        CreatureManager creatureManager = new CreatureManager(enclosure);
        Scanner scanner = creatureManager.getScanner();
        assertNotNull(scanner);

        creatureManager.closeScanner();

        assertTrue(false);
    }
}
