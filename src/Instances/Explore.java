/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instances;

/**
 *
 * @author Fairlyn
 */
public class Explore {

    int explore, type, number, biome;
    /*
     * explore, is the id of the explore class.
     * type is what kind of type it's calling Enemy/location, and so on
     * location is if it's a creature or event that only happens in a specific biome
     */

    public int getExplore() {
        return explore;
    }
    public void setExplore(int explore) {
        this.explore = explore;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getBiome() {
        return biome;
    }
    public void setBiome(int biome) {
        this.biome = biome;
    }
}
