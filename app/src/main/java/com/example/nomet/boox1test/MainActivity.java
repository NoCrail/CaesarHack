package com.example.nomet.boox1test;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public static boolean randomonce = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Startbtn = (Button)findViewById(R.id.StartBTN);
        Startbtn.requestFocus();
        final Button Aboutbtn = (Button)findViewById(R.id.AboutBTN);
        final ToggleButton RandomSwitch = (ToggleButton)findViewById(R.id.toggleButton);

        Startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game = new Intent(MainActivity.this, GameActivity.class);

                startActivity(game);
            }
        });

        RandomSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(RandomSwitch.isChecked()) randomonce = true; else randomonce = false;
            }
        });

        RandomSwitch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(RandomSwitch.hasFocus()) RandomSwitch.setTextColor(Color.WHITE); else RandomSwitch.setTextColor(Color.BLACK);
            }
        });
        Startbtn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(Startbtn.hasFocus()) Startbtn.setTextColor(Color.WHITE); else Startbtn.setTextColor(Color.BLACK);
            }
        });
        Aboutbtn.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(Aboutbtn.hasFocus())Aboutbtn.setTextColor(Color.WHITE); else Aboutbtn.setTextColor(Color.BLACK);
            }
        });
        Aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, ActivityAbout.class);

                startActivity(about);
            }
        });

    }
}
