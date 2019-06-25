package models;

import java.util.ArrayList;

public class Heroes {
    private String name;
    private String superPower;
    private String role;
    public static ArrayList<Heroes> allheroes = new ArrayList<>();

    public Heroes(String name, String power, String role){
        this.name = name;
        this.superPower = power;
        this.role = role;
        allheroes.add(this);
    }

    public String getName() {
        return name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getRole() {
        return role;
    }

    public static ArrayList<Heroes> getAllheroes() {
        return allheroes;
    }

    public static void clearAllHeroes(){
        allheroes.clear();
    }
}
