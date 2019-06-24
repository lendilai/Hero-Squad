package models;

import java.util.ArrayList;

public class Squads {
    private String mSquadName;
    private String mTheme;
    private int mMaxHeroes;
    public static ArrayList<Squads> allSquads = new ArrayList<>();

    public Squads(String name, String theme, int max){
        this.mSquadName = name;
        this.mTheme = theme;
        this.mMaxHeroes = max;
        allSquads.add(this);
    }

    public String getmSquadName() {
        return mSquadName;
    }

    public String getmTheme() {
        return mTheme;
    }

    public int getmMaxHeroes() {
        return mMaxHeroes;
    }

    public ArrayList<Squads> getAllSquads() {
        return allSquads;
    }

    public static void clearAll(){
        allSquads.clear();
    }
}
