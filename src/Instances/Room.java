/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Instances;

/**
 *
 * @author Fairlyn
 */
public class Room {
    private String decriptiom;
    private Room exitNorth, exitSouth, exitWest, exitEast;
    private Encounter encounter = null;
    private Enemy enemy = null;
    private Location location = null;
    private int id;

    public String getDecriptiom() {
        return decriptiom;
    }

    public void setDecriptiom(String decriptiom) {
        this.decriptiom = decriptiom;
    }

    public Room getExitNorth() {
        return exitNorth;
    }

    public void setExitNorth(Room exitNorth) {
        this.exitNorth = exitNorth;
    }

    public Room getExitSouth() {
        return exitSouth;
    }

    public void setExitSouth(Room exitSouth) {
        this.exitSouth = exitSouth;
    }

    public Room getExitWest() {
        return exitWest;
    }

    public void setExitWest(Room exitWest) {
        this.exitWest = exitWest;
    }

    public Room getExitEast() {
        return exitEast;
    }

    public void setExitEast(Room exitEast) {
        this.exitEast = exitEast;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
