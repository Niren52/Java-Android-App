package com.example.niren.nirenpatelsapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class West extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);

        String[] subList = {"Random Facts", "General Information", "Landmarks"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, subList);

        ListView list1 = (ListView) findViewById(R.id.westList);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent goIR = new Intent(West.this, WestRandom.class);
                        startActivity(goIR);
                        break;

                    case 1:
                        Intent goGI = new Intent(West.this, WestGI.class);
                        startActivity(goGI);
                        break;
                    case 2:
                        Intent goLandmark = new Intent(West.this, WestLandmark.class);
                        startActivity(goLandmark);
                        break;
                }

            }
        })
        ;}
}


