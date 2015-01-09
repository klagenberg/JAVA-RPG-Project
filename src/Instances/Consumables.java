/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instances;

/**
 *
 * @author Fairlyn
 */
public class Consumables extends Items {

    String effectText;
    int effect, amount;

    public String getEffectText() {
        return effectText;
    }

    public void setEffectText(String effectText) {
        this.effectText = effectText;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}