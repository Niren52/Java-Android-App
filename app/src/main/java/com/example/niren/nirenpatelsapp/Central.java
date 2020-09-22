package com.example.niren.nirenpatelsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Central extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);
        String[] subList = {"Random Facts", "General Information", "Landmarks"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subList);

        ListView list1 = (ListView) findViewById(R.id.centralList);
        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                    Intent goR = new Intent(Central.this, CentralRandom.class);
                    startActivity(goR);
                    break;

                    case 1:
                    Intent goGI = new Intent(Central.this, CentralGI.class);
                    startActivity(goGI);
                    break;
                    case 2:
                    Intent goLandmark = new Intent(Central.this, CentralLandmark.class);
                    startActivity(goLandmark);
                    break;
                }

            }
            })
    ;}
}