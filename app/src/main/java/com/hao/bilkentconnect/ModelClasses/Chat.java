package com.hao.bilkentconnect.ModelClasses;

import java.util.ArrayList;

public class Chat {
    // Attributes
    private String user1; // Assuming 'user1' is represented by an integer ID
    private String user2; // Assuming 'user2' is represented by an integer ID
    private ArrayList<ChatMessage> chatMessages;

    // Constructor
    public Chat(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
        this.chatMessages = new ArrayList<>();
    }

    // Methods
    public void addMessage(ChatMessage message) {
        // TODO: Implement method logic for adding a message to the chat
        chatMessages.add(message);
    }

    // sanırım bu methodu pek kullanmayacağız mesajları silmeyeceğimiz için
    public void removeMessage(ChatMessage message) {
        // TODO: Implement method logic for removing a message from the chat
        chatMessages.remove(message);
    }

    @Override
    public String toString() {
        // TODO: Implement the toString method
        return null;
    }

    // Getters and Setters
    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public ArrayList<ChatMessage> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(ArrayList<ChatMessage> chatMessages) {
        this.chatMessages = chatMessages;
    }



}
