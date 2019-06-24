package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Squads.clearAll();
    }

    public Squads setUpSquad(){
        return new Squads("Menace", "To destroy and conquer", 5);
    }
    @Test
    public void newSquad_instantiates_correctly_withCorrectValues_true() throws Exception{
        Squads first = setUpSquad();
        Squads second = setUpSquad();
        assertEquals(true, first instanceof Squads);
        assertEquals("Menace", first.getmSquadName());
        assertEquals("To destroy and conquer", first.getmTheme());
        assertEquals(5, first.getmMaxHeroes());
    }
}