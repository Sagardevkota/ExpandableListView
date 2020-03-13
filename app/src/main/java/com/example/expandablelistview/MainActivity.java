package com.example.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView=findViewById(R.id.expandable_listview);
        List<String> headings=new ArrayList<String>();
        final List<String> L1=new ArrayList<String>();
        List<String> L2=new ArrayList<String>();
        List<String> L3=new ArrayList<String>();
        final HashMap<String,List<String>> childList=new HashMap<String, List<String>>();
        String heading_items[]=getResources().getStringArray(R.array.heading_titles);
        String l1[]=getResources().getStringArray(R.array.h1_items);

        String l2[]=getResources().getStringArray(R.array.h2_items);

        String l3[]=getResources().getStringArray(R.array.h3_items);

        for (String title:heading_items){
            headings.add(title);
        }
        for (String title:l1){
            L1.add(title);
        }
        for (String title:l2){
            L2.add(title);
        }
        for (String title:l3){
            L3.add(title);
        }
        childList.put(headings.get(0),L1);
        childList.put(headings.get(1),L2);
        childList.put(headings.get(2),L3);
        ExpandableListAdapter expandableListAdapter=new ExpandableListAdapter(getApplicationContext(),headings,childList);
        expandableListView.setAdapter(expandableListAdapter);











    }
}
