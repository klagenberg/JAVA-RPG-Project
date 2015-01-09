/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instances;

/**
 *
 * @author Fairlyn
 */
public class EnemyAttack {
    int damage;
    String desc;
    boolean trap, poison;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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