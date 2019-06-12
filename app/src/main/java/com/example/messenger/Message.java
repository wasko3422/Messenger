package com.example.messenger;

// Message.java
public class Message {
    private String text; // message body
    private String author; // data of the user that sent this message
    private boolean belongsToCurrentUser; // is this message sent by us?

    public Message(String text, String author, boolean belongsToCurrentUser) {
        this.text = text;
        this.author = author;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}
