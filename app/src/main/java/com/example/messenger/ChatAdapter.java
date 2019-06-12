package com.example.messenger;


import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ChatAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater layoutInflater;
    ArrayList<Chat> chats;

    ChatAdapter(Context context, ArrayList<Chat> _chats){
        ctx = context;
        chats = _chats;
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return chats.size();
    }

    @Override
    public Object getItem(int position){
        return chats.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.chat_item, parent, false);
        }

        Chat c = getChat(position);

        ((TextView)view.findViewById((R.id.message_author))).setText(c.AuthorName);
        ((TextView)view.findViewById((R.id.message_body))).setText(c.message);
        //TODO AVATARKA

        return view;
    }

    Chat getChat(int i){
        return ((Chat)getItem(i));
    }
}
