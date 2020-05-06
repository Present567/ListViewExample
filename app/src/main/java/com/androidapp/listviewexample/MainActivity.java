package com.androidapp.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyListAdpater myListAdapter;
    ArrayList<list_item> list_itemArrayList;
    private Context MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.my_listView);
        list_itemArrayList = new ArrayList<list_item>();
        list_itemArrayList.add(
                new list_item(R.mipmap.ic_launcher,"보라돌이","제목1",new Date(System.currentTimeMillis()),"내용1"));
        list_itemArrayList.add(
                new list_item(R.mipmap.ic_launcher,"뚜비","제목2",new Date(System.currentTimeMillis()),"내용2"));
        list_itemArrayList.add(
                new list_item(R.mipmap.ic_launcher,"나나","제목3",new Date(System.currentTimeMillis()),"내용3"));
        list_itemArrayList.add(
                new list_item(R.mipmap.ic_launcher,"뽀","제목4",new Date(System.currentTimeMillis()),"내용4"));
        list_itemArrayList.add(
                new list_item(R.mipmap.ic_launcher,"햇님","제목5",new Date(System.currentTimeMillis()),"내용5"));

        myListAdapter = new MyListAdpater(MainActivity.this,list_itemArrayList);
        listView.setAdapter((ListAdapter) myListAdapter);

    }




}