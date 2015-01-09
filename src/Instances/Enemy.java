/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instances;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Fairlyn
 */
public class Enemy {

    private int health, damage, item, xp;
    private String name, winMessage, loseMessage, attackMessage, playerIsTrappedmessage, PlayerBreaksFreeMessage, enemyApproachesMessage;
    private boolean trap, poison;
    private ArrayList<EnemyAttack> arrayAttack = new ArrayList();

    public String getPlayerIsTrappedmessage() {
        return playerIsTrappedmessage;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public ArrayList<EnemyAttack> getArrayAttack() {
        return arrayAttack;
    }

    public void setArrayAttack(ArrayList<EnemyAttack> arrayAttack) {
        this.arrayAttack = arrayAttack;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setPlayerIsTrappedmessage(String playerIsTrappedmessage) {
        this.playerIsTrappedmessage = playerIsTrappedmessage;
    }

    public String getPlayerBreaksFreeMessage() {
        return PlayerBreaksFreeMessage;
    }

    public void setPlayerBreaksFreeMessage(String PlayerBreaksFreeMessage) {
        this.PlayerBreaksFreeMessage = PlayerBreaksFreeMessage;
    }

    public String getEnemyApproachesMessage() {
        return enemyApproachesMessage;
    }

    public void setEnemyApproachesMessage(String enemyApproachesMessage) {
        this.enemyApproachesMessage = enemyApproachesMessage;
    }
    Random random = new Random();

    public String getWinMessage() {
        return winMessage;
    }

    public void getAttack() {
        if (trap == false) {
            int i = random.nextInt(arrayAttack.size());
            EnemyAttack attack = arrayAttack.get(i);
            this.attackMessage = attack.getDesc();
            this.damage = attack.getDamage();
            this.poison = attack.isPoison();
            this.trap = attack.isTrap();
        }
    }

    public void setAttackMessage(String attackMessage) {
        this.attackMessage = attackMessage;
    }

    public void setWinMessage(String winMessage) {
        this.winMessage = winMessage;
    }

    public String getLoseMessage() {
        return loseMessage;
    }

    public void setLoseMessage(String loseMessage) {
        this.loseMessage = loseMessage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAttackMessage(String message) {
        this.attackMessage = message;
    }

    public String getAttackMessage() {
        return attackMessage;
    }

    public void addAttack() {
        EnemyAttack attack = new EnemyAttack();
        attack.setDesc(attackMessage);
        attack.setDamage(damage);
        attack.setPoison(poison);
        attack.setTrap(trap);
        arrayAttack.add(attack);
        this.attackMessage = null;
        this.damage = 0;
        this.poison = false;
        this.trap = false;
    }

    public boolean isTrap() {
        return trap;
    }

    public void setTrap(boolean trap) {
        this.trap = trap;
    }

    public boolean isPoison() {
        return poison;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }
}
