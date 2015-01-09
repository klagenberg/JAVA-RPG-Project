/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generators;

import Instances.Room;

/**
 *
 * @author Fairlyn
 */
public class Dungeon {

    public void GenerateDungeon() {
        Room room = new Room();
        room.setId(0);
        room.setDecriptiom("This is the entrance room.");
        room.setExitNorth(null);
        room.setExitEast(null);
        room.setExitSouth(null);
        room.setExitWest(null);
        room.setLocation(null);
    }
}
