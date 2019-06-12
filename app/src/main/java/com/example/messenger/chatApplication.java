package com.example.messenger;

import android.app.Application;

import java.util.ArrayList;

public class chatApplication extends Application {

    private ArrayList<ArrayList<Message>> history;
    private ArrayList<Chat> chats;

    @Override
    public void onCreate (){
        super.onCreate();
        chats = new ArrayList<Chat>();
        history = new  ArrayList<ArrayList<Message>>();
        chats.add(new Chat("Роман Митюшов", "Привет, погнали!"));
        chats.add(new Chat("Денис Уланов", "vecherom"));

        ArrayList<Message> chatRoma = new ArrayList<Message>();
        Message message1 = new Message("Привет!","Роман Митюшов", false);
        chatRoma.add(message1);
        chatRoma.add(new Message("Погнали делать машин лернинг!","Роман Митюшов", false));
        chatRoma.add(new Message("Привет, погнали!","", true));
        history.add(chatRoma);

        ArrayList<Message> chatDenis = new ArrayList<Message>();
        chatDenis.add(new Message("Здорова, когда поедем катать???","Денис Уланов", false));
        chatDenis.add(new Message("Нубас!!!!!!!!!","Денис Уланов", false));
        chatDenis.add(new Message("Privet, nadoel uzhe obzivatsya","", true));
        chatDenis.add(new Message("vecherom","", true));
        history.add(chatDenis);

    }
    public ArrayList<ArrayList<Message>> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ArrayList<Message>> newHistory) {
        history = newHistory;
    }
    public ArrayList<Chat> getChats(){
        return chats;
    }
    public void setChats(ArrayList<Chat> newChats){
        chats = newChats;
    }
}