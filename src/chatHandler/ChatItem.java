/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatHandler;

import java.util.ArrayList;

/**
 *
 * @author Fairlyn
 */
public class ChatItem {

    private String chatMessage;
    ArrayList<ChatItem> messages = new ArrayList();

    //deals with the generated items this one needs.
    void setNextItem(String chatmessage) {
        ChatItem item = new ChatItem();
        item.setMessage(chatMessage);
        messages.add(item);
    }

    public ChatItem getNextItem(int i) {
        return messages.get(i);
    }

    //deals with the String message for this object
    public String getChatMessage() {
        return chatMessage;
    }

    public void setMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    //use to add an already generated to the obtions list
    public void forceSetNextItem(ChatItem Item) {
        messages.add(Item);
    }

}
