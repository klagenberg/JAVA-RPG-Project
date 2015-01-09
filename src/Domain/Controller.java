/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import DataSource.DBFacade;
import Instances.Consumables;
import Instances.Enemy;
import Instances.Explore;
import Instances.Location;
import Instances.PlayerEffects;

/**
 *
 * @author Fairlyn
 */
public class Controller {

    int action;
    int biome = 1;
    int consumable;
    int GUIAction;
    Fight fight = new Fight();
    Explore explore = new Explore();
    Consumables potion = null;
    Enemy enemy = null;
    Location loc = null;
    PlayerEffects player = null;
    String enemyMessage, playerMessage, result;
    private static Controller controller = null;
    String newline = System.getProperty("line.separator");
    DBFacade dbf = null;

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;

    }

    private Controller() {
        DBFacade dbf = DBFacade.getInstance();
    }
    
    

    public PlayerEffects getPlayer() {
        return fight.player;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void setPlayer(PlayerEffects player) {
        this.player = player;
    }

    public void createPlayer() {
        PlayerEffects player = new PlayerEffects();
        player.setStrength(4);
        player.setDexterity(4);
        player.setIntelligence(4);
        player.setConstitution(7);
        player.calculateDamage();
        player.calculateHealth();
        player.setHealth(player.getMaxHealth());
        player.setWinMessage("I have bestet you!");
        player.setAttackMessage("I will slay you!");
        this.player = player;
        createHealthPotion();
    }

    public void loadEnemy(int number) {
        this.enemy = dbf.getEnemy(number);
    }

    public String Action() {
        switch (action) {
            case (1): //start combat
                int number = explore.getNumber();
                loadEnemy(number);
                result = enemyApproaches();
                this.action = 2;
                this.GUIAction = 1;
                break;
            case (2): // continue combat
                controller.endTurnCombat();
                result = controller.getPlayerMessage() + newline + newline;
                result = result + "you have" + getHealth() + "out of a max of" + getfullHealth() + newline + newline;
                result = result + getEnemyMessage() + newline + newline;
                break;
            case (3): // explore the area
                getLocation(biome);
                result = loc.getDescription();
                this.GUIAction = 3;
                break;
            case (4):
                //consumables
                break;
            case (5):
                // at camp
                this.GUIAction = 5;
                break;
            default:
                action = 5;
                Action();
                break;
        }
        System.out.println("action: " + action);
        return result;
    }

    public int endTurnCombat() {
        fight.setPlayer(player);
        fight.setEnemy(enemy);
        int result = fight.resolveTurn();
        this.player = fight.getPlayer();
        this.enemy = fight.getEnemy();
        playerMessage = player.getAttackMessage();
        if (enemy.isTrap() == true) {
            playerMessage = enemy.getPlayerIsTrappedmessage();
        }
        if (player.isBrokeFree() == true) {
            playerMessage = enemy.getPlayerBreaksFreeMessage();
            player.setBrokeFree(false);
        }
        if (result > 0) {
            enemyMessage = enemy.getLoseMessage();
            playerMessage = player.getWinMessage();
            action = 5;
            //add xp and item gain to here
            result = 0;
        } else if (result < 0) {
            enemyMessage = enemy.getWinMessage();
            playerMessage = "I lost..";
            action = 5;
            //
        } else {
            enemyMessage = enemy.getAttackMessage();
        }
        return result;
    }
    
    void getExplore(int biome) {
        this.explore = dbf.getExplore(biome);
    }

    public void getLocation(int biome){
        this.loc = dbf.getLocation(biome);
    }
    
    public void createHealthPotion() {
        potion = new Consumables();
        potion.setEffect(5);
        potion.setAmount(5);
        potion.setEffectText("you feel healed.");
    }

    public void useHealthPotion() {
        int effect = potion.getEffect();
        int amount = potion.getAmount();
        player.effect(effect, amount);
        player.effect(4, 2);
    }

    public int getHealth() {
        return player.getHealth();
    }

    public int getfullHealth() {
        return player.getMaxHealth();
    }

    public String enemyApproaches() {
        return enemy.getEnemyApproachesMessage();
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public String getEnemyMessage() {
        return enemyMessage;
    }

    public String getPlayerMessage() {
        return playerMessage;
    }

    public void calculateDamage() {
        player.calculateDamage();
    }
    
    
    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public int getBiome() {
        return biome;
    }

    public void setBiome(int biome) {
        this.biome = biome;
    }

    public Fight getFight() {
        return fight;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }

    public void setExplore(Explore explore) {
        this.explore = explore;
    }

    public Consumables getPotion() {
        return potion;
    }

    public void setPotion(Consumables potion) {
        this.potion = potion;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static Controller getController() {
        return controller;
    }

    public static void setController(Controller controller) {
        Controller.controller = controller;
    }

    public String getNewline() {
        return newline;
    }

    public void setNewline(String newline) {
        this.newline = newline;
    }
    
    public int getGUIAction() {
        return GUIAction;
    }

    public void setGUIAction(int GUIAction) {
        this.GUIAction = GUIAction;
    }
    
    public void restNight(){
        player.setHealth(player.getMaxHealth());
    }
            
}