package com.example.niren.nirenpatelsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CentralRandom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_random);

        final TextView textView = (TextView) findViewById(R.id.TextRC);
        Button press = (Button) findViewById(R.id.pressRC);
        final String [] facts = {"Fact l", "Fact 2", "Fact 3", "Fact 4", "Fact 5"};

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int random = (int) ((Math.random()*5));
            textView.setText(facts[random]);
            }
        }
        );
    }
}