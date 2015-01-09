/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Instances.Enemy;
import Instances.PlayerEffects;
import java.util.Random;

/**
 *
 * @author Fairlyn
 */
public class Fight {

    Random random = new Random();
    Enemy enemy = null;
    PlayerEffects player = null;

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public PlayerEffects getPlayer() {
        return player;
    }

    public void setPlayer(PlayerEffects player) {
        this.player = player;
    }

    public int resolveTurn() {
        if (enemy.isTrap() == true) {
            if (player.getStrength() > random.nextInt(5)) {
                //player breaks free
                player.setConstricted(false);
                player.setBrokeFree(true);
                enemy.setTrap(false);
            } else {
                //player is still immobilized and taking damage
                int damagetaken = player.getMaxHealth() / 10;
                player.setHealth(player.getHealth() - damagetaken);
            }
        } else {
            enemy.getAttack();
            int damageDealt = player.getDamage();
            int damagetaken = enemy.getDamage();
            int playerHealth = player.getHealth() - damagetaken;
            player.setHealth(playerHealth);
            int enemyHealth = enemy.getHealth() - damageDealt;
            enemy.setHealth(enemyHealth);
            if (enemyHealth <= 0) {
                return 1;
            } else if (playerHealth <= 0) {
                return -1;
            }
        }

        return 0;
    }
}