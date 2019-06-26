package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Heroes {
    private String name;
    private String superPower;
    private String role;
    private int squadId;
    private static List<Heroes> allHeroes = new ArrayList<>();

    public Heroes(String name, String power, String role, int squadId){
        this.name = name;
        this.superPower = power;
        this.role = role;
        Squads squads = Squads.squadWithId(squadId);
        allHeroes.add(this);
        this.match(squadId,name);
    }

    public String getName() {
        return name;
    }

    public void match(int id,String name){
        for(Map.Entry<Integer, ArrayList<Heroes>> matchSquad : Squads.storeHeroes.entrySet()){
            if(id==matchSquad.getKey())  {
                  matchSquad.getValue().add(this);
                  break;
               }
        }
    }

    public String getSuperPower() {
        return superPower;
    }

    public String getRole() {
        return role;
    }

    public static List<Heroes> getAllHeroes() {
        return allHeroes;
    }

    public int getSquadId() {
        return squadId;
    }

    public static void clearAllHeroes(){
        allHeroes.clear();
    }
}
