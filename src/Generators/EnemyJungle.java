/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generators;

import Instances.Enemy;

/**
 *
 * @author Fairlyn
 */
public class EnemyJungle {

    public void generateEnemy() {
        //generate enemy
        Enemy enemy = new Enemy();
        //descripe what happens when you run into this enemy
        enemy.setEnemyApproachesMessage("walking around the trees you see what looks like a giant green scaled snake, it glances in your direction before looking away."
                + "You think you got lucky and it's leaving you alone, but no.. A few seconds later the branches above creaks beofre the snake lands almost right beside you."
                + "It's scales resting in a circle aroudn you as it eyes you with it's yellow eyes. Seems it's chosen you as it's next meal.");
        //the player is trapped by the enemy and can't get loose, describe it.
        enemy.setPlayerIsTrappedmessage("it's coils keeps wrapping around you tighter and tighter. your bones are startign to creek and you cna feel sweet oblivion coming closer as it's squeezes your life out of you");
        //the player have successfully aliminated another thread.
        enemy.setLoseMessage("");
        //the player loses and the enemy just won
        enemy.setWinMessage("");
        
        //generate attack
        //description of the attack.
        enemy.setAttackMessage("the snake slithers closer and, before you get a chance to react, it wraps you up in it coils tightly and start squeezing tightly");
        //amount of damage inflickted
        enemy.setDamage(5);
        //boolean Does it deal poison?
        enemy.setPoison(false);
        //boolean, does it take away the player's ability to react?
        enemy.setTrap(true);
        //adds the attack to the enemy class
        enemy.addAttack();
    }

}
