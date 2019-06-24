package models;

import java.util.ArrayList;

public class Squads {
    private String squadName;
    private String theme;
    private String url;
    private int maxHeroes;
    private int id;
    public static ArrayList<Squads> allSquads = new ArrayList<>();

    public Squads(String name, String theme, String url, int max){
        this.squadName = name;
        this.theme = theme;
        this.url = url;
        this.maxHeroes = max;
        allSquads.add(this);
        this.id = allSquads.size();
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

    public static void clearAll(){
        allSquads.clear();
    }
}
