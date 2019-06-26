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
        Heroes.clearAllHeroes();
    }

    public Heroes setUpHero(){
        return new Heroes("IronMan", "Smart", "Leader",1);
    }
    @Test
    public void newHero_instantiates_correctly() throws Exception{
        Heroes newHero = setUpHero();
        assertEquals(true, newHero instanceof Heroes);
        assertEquals("IronMan", newHero.getName());
        assertEquals("Smart", newHero.getSuperPower());
        assertEquals("Leader", newHero.getRole());
    }

    @Test
    public void getAllHeroes_capturesAllHeroes_2() throws Exception{
        Heroes first = setUpHero();
        Heroes second = setUpHero();
        assertEquals(2, Heroes.getAllHeroes().size());
    }

    @Test
    public void matchMatchesHeroToSQuad_true() throws  Exception{
        Squads newSquad = new Squads("Avengers", "Assemble", "http.ytr.com", 2);
        Squads second = new Squads("Justice", "None", "Lame", 1);
        Heroes newHero  = new Heroes("we", "we", "we", newSquad.getId());
        Heroes secondHero = new Heroes("hgf", "fg", "hgc", second.getId());
        System.out.println(Squads.matchHero(newSquad.getId()));
        System.out.println(Squads.storeHeroes.get(1).get(1).getName());
        System.out.println(Squads.storeHeroes.get(2).get(1).getRole());
    }
}