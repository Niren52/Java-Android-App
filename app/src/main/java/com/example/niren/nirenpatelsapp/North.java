package com.example.niren.nirenpatelsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class North extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);
        String[] subList = {"Random Facts", "General Information", "Landmarks"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, subList);

        ListView list1 = (ListView) findViewById(R.id.northList);
        list1.setAdapter(adapter);


        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                        Intent goIR = new Intent(North.this, NorthRandom.class);
                        startActivity(goIR);
                        break;

                    case 1:
                        Intent goGI = new Intent(North.this, NorthGI.class);
                        startActivity(goGI);
                        break;
                    case 2:
                        Intent goLandmark = new Intent(North.this, NorthLandmark.class);
                        startActivity(goLandmark);
                        break;
                }

            }
        })
        ;}
}



