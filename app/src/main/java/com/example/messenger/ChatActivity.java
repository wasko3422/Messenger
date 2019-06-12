package com.example.messenger;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    private EditText editText;
    private MessageAdapter adapter;
    private  int number;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        editText = (EditText)findViewById(R.id.editText);
        ListView messages = (ListView)findViewById(R.id.messages_view);
        adapter = new MessageAdapter(this);

        number =  getIntent().getIntExtra("num", 0);

        adapter.messages = ((chatApplication) getApplicationContext()).getHistory().get(number);
        messages.setAdapter(adapter);

    }

    public void sendMessage(View view) {
        String message = editText.getText().toString();
        if (message.length() > 0) {

            String data = "Roma";
            Message message1 = new Message(message.toString(), data, true);
            adapter.add(message1);
            adapter.notifyDataSetChanged();
            Chat c = ((chatApplication) getApplicationContext()).getChats().get(number);
            c.message = message.toString();
            ((chatApplication) getApplicationContext()).getChats().set(number, c);
            editText.getText().clear();
        }
    }
}
