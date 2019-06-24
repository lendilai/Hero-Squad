package models;

import java.util.ArrayList;

public class Squads {
    private String squadName;
    private String theme;
    private int maxHeroes;
    public static ArrayList<Squads> allSquads = new ArrayList<>();

    public Squads(String name, String theme, int max){
        this.squadName = name;
        this.theme = theme;
        this.maxHeroes = max;
        allSquads.add(this);
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

    public static ArrayList<Squads> getAllSquads() {
        return allSquads;
    }

    public static void clearAll(){
        allSquads.clear();
    }
}
