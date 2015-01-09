/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatHandler;

/**
 *
 * @author Fairlyn
 */
public class ChatBuilder {

    //use a treeset to store it and let the end link back to the start at an appropiate time.
    public void buildmessages() {
        ChatItem item = new ChatItem();
        ChatItem item1;
        item.setMessage("message one");
        item.setNextItem("message Two");
        item1 = item;
        //switch to next item
        item = item.getNextItem(0);
        item.setNextItem("message 3");
        //switch to next item
        item = item.getNextItem(0);
        //points back at the first message
        item.forceSetNextItem(item1);
    }
}
