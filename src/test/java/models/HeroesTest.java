package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public Heroes setUpHero(){
        return new Heroes("IronMan", "Smart", "Leader");
    }
    @Test
    public void newHero_instantiates_correctly() throws Exception{
        Heroes newHero = setUpHero();
        assertEquals(true, newHero instanceof Heroes);
        assertEquals("IronMan", newHero.getName());
        assertEquals("Smart", newHero.getSuperPower());
        assertEquals("Leader", newHero.getRole());
    }
}