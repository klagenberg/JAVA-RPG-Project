/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Instances;

/**
 *
 * @author Fairlyn
 */
public class Items {

    String description, onUseDescription, name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    int sellValue;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOnUseDescription() {
        return onUseDescription;
    }

    public void setOnUseDescription(String onUseDescription) {
        this.onUseDescription = onUseDescription;
    }

    public int getSellValue() {
        return sellValue;
    }

    public void setSellValue(int sellValue) {
        this.sellValue = sellValue;
    }
}
