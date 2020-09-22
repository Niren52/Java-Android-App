package com.example.niren.nirenpatelsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class London extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_london);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                Intent gocentral = new Intent(London.this, Central.class);
                 startActivity(gocentral);
                break;

            case R.id.button2:
                Intent gowest = new Intent(London.this, West.class);
                startActivity(gowest);
                break;

            case R.id.button3:
                Intent gonorth = new Intent(London.this, North.class);
                startActivity(gonorth);
                break;

            case R.id.button4:
                Intent goeast = new Intent(London.this, East.class);
                startActivity(goeast);
                break;

            case R.id.button5:
                Intent gosouth = new Intent(London.this, South.class);
                startActivity(gosouth);
                break;
        }
    }
}