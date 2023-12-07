package org.example.creatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LycanthropeTest {

    // generate test for Lycanthrope class
    @Test
    void displayCharacteristics() {
        //generate test for Lycanthrope class
        Lycanthrope lycanthrope = new Lycanthrope("Lyly", "Femelle", 50, 180, 25, 100, "Ahouuuuuuu");
        assertEquals("Lyly", lycanthrope.getName());
        assertEquals("Femelle", lycanthrope.getGender());
        assertEquals(50, lycanthrope.getWeight());
        assertEquals(180, lycanthrope.getHeight());
        assertEquals(25, lycanthrope.getAge());
        assertEquals(100, lycanthrope.getHealth());
        assertEquals("Ahouuuuuuu", lycanthrope.getCries());
        assertEquals("Lycanthrope", lycanthrope.getSpecies());

    }

   /* @Test
    void howl() {
        Lycanthrope lycanthrope = new Lycanthrope("Lyly", "Femelle", 50, 180, 25, 100, "Ahouuuuuuu");
       ;

    }*/

    @Test
    void hearHowl() {
        Lycanthrope lycanthrope = new Lycanthrope("Lyly", "Femelle", 50, 180, 25, 100, "Ahouuuuuuu");
        assertEquals("Lyly entend un hurlement.", lycanthrope.hearHowl());

    }

    @Test
    void leavePack() {
        Lycanthrope lycanthrope = new Lycanthrope("Lyly", "Femelle", 50, 180, 25, 100, "Ahouuuuuuu");
        lycanthrope.leavePack();
        assertNull(lycanthrope.getPack());
    }

    @Test
    void transformIntoHuman() {
        Lycanthrope lycanthrope = new Lycanthrope("Lyly", "Femelle", 50, 180, 25, 100, "Ahouuuuuuu");
        lycanthrope.transformIntoHuman();
        assertEquals("Lyly se transforme en humain.", lycanthrope.transformIntoHuman());
    }


    @Test
    void setPack() {
        Lycanthrope lycanthrope = new Lycanthrope("Lyly", "Femelle", 50, 180, 25, 100, "Ahouuuuuuu");
        Pack pack = new Pack("Pack");
        lycanthrope.setPack(pack);
        assertEquals(pack, lycanthrope.getPack());
    }
}