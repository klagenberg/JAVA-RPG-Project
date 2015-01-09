/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instances;

/**
 *
 * @author Fairlyn
 */
public class PlayerEffects extends Player {

    public void effect(int effect, int amount) {
        switch (effect) {
            case 1:
                setStrength(getStrength() + amount);
                calculateDamage();
                break;
            case 2:
                setDexterity(getDexterity() + amount);
                break;
            case 3:
                setIntelligence(getIntelligence() + amount);
                break;
            case 4:
                setConstitution(getConstitution() + amount);
                calculateHealth();
            case 5:
                setHealth(getHealth() + amount);
                if (getHealth() > getMaxHealth()) {
                    setHealth(getMaxHealth());
                }
        }
    }
}
