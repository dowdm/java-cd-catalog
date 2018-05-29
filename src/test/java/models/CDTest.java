package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CDTest {

    @Test
    public void newCD_intantiatesANewCDObject() {
        CD testCD = new CD("Automata 1", "BTBAM", 2018, "Metal");
        assertEquals(true, testCD instanceof CD);
    }

    @Test
    public void getTitle_getterWorks() {
        CD testCD = new CD("Automata 1", "BTBAM", 2018, "Metal");
        assertEquals("Automata 1", testCD.getTitle());
    }

    @Test
    public void getArtist_getterWorks() {
        CD testCD = new CD("Automata 1", "BTBAM", 2018, "Metal");
        assertEquals("BTBAM", testCD.getArtist());
    }

    @Test
    public void getYear_getterWorks() {
        CD testCD = new CD("Automata 1", "BTBAM", 2018, "Metal");
        assertEquals(2018, testCD.getYear());
    }

    @Test
    public void getGenre_getterWorks() {
        CD testCD = new CD("Automata 1", "BTBAM", 2018, "Metal");
        assertEquals("Metal", testCD.getGenre());
    }

    @Test
    public void AllCDsAreCorrectlyReturned_true() {
        CD testCD = new CD("Automata 1", "BTBAM", 2018, "Metal");
        CD otherCD = new CD("Electric Ladyland", "Jimmy Hendrix", 1968, "Rock");
        assertEquals(2, CD.getAll().size());
    }

    @Test
    public void AllCDsAreContainsAllCDs_true() {
        CD testCD = new CD("Automata 1", "BTBAM", 2018, "Metal");
        CD otherCD = new CD("Electric Ladyland", "Jimmy Hendrix", 1968, "Rock");
        assertTrue(CD.getAll().contains(testCD));
        assertTrue(CD.getAll().contains(otherCD));
    }
}