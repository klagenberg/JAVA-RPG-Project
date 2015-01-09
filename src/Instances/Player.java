package Instances;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fairlyn
 */
public class Player {

    int health, maxHealth, strength, dexterity, intelligence, constitution, damage, xp, level;
    String name, winMessage, attackMessage;
    boolean poisoned, constricted, brokeFree;

    public boolean isBrokeFree() {
        return brokeFree;
    }

    public void setBrokeFree(boolean brokeFree) {
        this.brokeFree = brokeFree;
    }

    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }

    public boolean isConstricted() {
        return constricted;
    }

    public void setConstricted(boolean constricted) {
        this.constricted = constricted;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWinMessage() {
        return winMessage;
    }

    public void setWinMessage(String winMessage) {
        this.winMessage = winMessage;
    }

    public String getAttackMessage() {
        return attackMessage;
    }

    public void setAttackMessage(String attackMessage) {
        this.attackMessage = attackMessage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }
    
    public void calculateLevel(){
        if(xp > 100){
            level = level +1;
            xp = xp -100;
        }
    }

    public void calculateDamage() {
        damage = (int) Math.round(strength * 1.5);
    }
    public void calculateHealth() {
        maxHealth = constitution * 3;
    }
}
