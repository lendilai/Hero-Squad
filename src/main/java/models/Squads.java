package models;

import java.util.ArrayList;
import java.util.List;

public class Squads {
    private String squadName;
    private String theme;
    private String url;
    private int maxHeroes;
    private int id;
    private static ArrayList<Squads> allSquads = new ArrayList<>();
    private static List<Heroes> heroesInSquad;

    public Squads(String name, String theme, String url, int max){
        this.squadName = name;
        this.theme = theme;
        this.url = url;
        this.maxHeroes = max;
        allSquads.add(this);
        this.id = allSquads.size();
        heroesInSquad = new ArrayList<>();
    }

    public String getSquadName() {
        return squadName;
    }

    public String getTheme() {
        return theme;
    }

    public int getMaxHeroes() {
        return maxHeroes;
    }

    public String getUrl() { return url; }

    public int getId() { return id; }

    public static ArrayList<Squads> getAllSquads() {
        return allSquads;
    }

    public static Squads squadWithId(int id){
        return allSquads.get(id - 1);
    }

    public void addHero(Heroes newHero){ heroesInSquad.add(newHero); }

    public static List<Heroes> getHeroesInSquad() {
        return heroesInSquad;
    }

    public static void clearAll(){
        allSquads.clear();
    }

}
