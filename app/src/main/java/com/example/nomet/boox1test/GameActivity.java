package com.example.nomet.boox1test;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    Random rnd = new Random(System.currentTimeMillis());
    int [] chisla = new int[5];
    int [] vvod = new int[5];
    int [] rand = {0,1,2,3,4,5,6,7,8,9};
    boolean [] active = new boolean[5];
    boolean endgame = false;
    long lastmillis = 0;
    int tries = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        if(MainActivity.randomonce){
        for (int i = 0; i<5; i++){
            active[i] = true;
            int r;
            r = rnd.nextInt(10);
            while (rand[r]==-1) r=rnd.nextInt(10);
            chisla[i] = rand[r];
            rand[r] = -1;

        }; } else
        {
            for (int i = 0; i<5; i++){
                active[i] = true;
                int r;
                r = rnd.nextInt(10);
                chisla[i]=r;
            }

        };


        final Chronometer secs = (Chronometer)findViewById(R.id.timer);
        final TextView timer = (TextView)findViewById(R.id.Timer);
        final TextView Ttry = (TextView)findViewById(R.id.Try);
        secs.setBase(SystemClock.elapsedRealtime());
        secs.start();

        secs.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                long elapsedMillis =SystemClock.elapsedRealtime() - secs.getBase();
                if(elapsedMillis-lastmillis > 5000) {

                    int time  = (int) (elapsedMillis/1000);
                    timer.setText(String.valueOf(time));
                    lastmillis = elapsedMillis;
                }
            }
        });

        final ImageView LockImage = (ImageView)findViewById(R.id.LockImage);
        final Button up1 = (Button)findViewById(R.id.UP1);
        final Button up2 = (Button)findViewById(R.id.UP2);
        final Button up3 = (Button)findViewById(R.id.UP3);
        final Button up4 = (Button)findViewById(R.id.UP4);
        final Button up5 = (Button)findViewById(R.id.UP5);
        final Button enter = (Button)findViewById(R.id.Enter);

        final Button down1 = (Button)findViewById(R.id.DOWN1);
        final Button down2 = (Button)findViewById(R.id.DOWN2);
        final Button down3 = (Button)findViewById(R.id.DOWN3);
        final Button down4 = (Button)findViewById(R.id.DOWN4);
        final Button down5 = (Button)findViewById(R.id.DOWN5);

        final TextView c1 = (TextView)findViewById(R.id.text1);
        final TextView c2 = (TextView)findViewById(R.id.text2);
        final TextView c3 = (TextView)findViewById(R.id.text3);
        final TextView c4 = (TextView)findViewById(R.id.text4);
        final TextView c5 = (TextView)findViewById(R.id.text5);

        ImageView i1 = (ImageView)findViewById(R.id.IMAGE1);
        ImageView i2 = (ImageView)findViewById(R.id.IMAGE2);
        ImageView i3 = (ImageView)findViewById(R.id.IMAGE3);
        ImageView i4 = (ImageView)findViewById(R.id.IMAGE4);
        ImageView i5 = (ImageView)findViewById(R.id.IMAGE5);

        final ImageView[] im  = {i1, i2, i3, i4, i5};
        final TextView[] textin = {c1,c2,c3,c4,c5};



        up1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (up1.hasFocus()) up1.setTextColor(Color.WHITE); else up1.setTextColor(Color.BLACK);
                }
        });
        up2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (up2.hasFocus()) up2.setTextColor(Color.WHITE); else up2.setTextColor(Color.BLACK);
            }
        });
       up3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (up3.hasFocus()) up3.setTextColor(Color.WHITE); else up3.setTextColor(Color.BLACK);
            }
        });
        up4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (up4.hasFocus()) up4.setTextColor(Color.WHITE); else up4.setTextColor(Color.BLACK);
                //if (up3.hasFocus()) up3.setTextColor(Color.WHITE); else up3.setTextColor(Color.BLACK);
            }
        });
        up5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (up5.hasFocus()) up5.setTextColor(Color.WHITE); else up5.setTextColor(Color.BLACK);
            }
        });
        down1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (down1.hasFocus()) down1.setTextColor(Color.WHITE); else down1.setTextColor(Color.BLACK);
            }
        });
        down2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (down2.hasFocus()) down2.setTextColor(Color.WHITE); else down2.setTextColor(Color.BLACK);

            }
        });
        down3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (down3.hasFocus()) down3.setTextColor(Color.WHITE); else down3.setTextColor(Color.BLACK);
            }
        });
        down4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (down4.hasFocus()) down4.setTextColor(Color.WHITE); else down4.setTextColor(Color.BLACK);
            }
        });
        down5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (down5.hasFocus()) down5.setTextColor(Color.WHITE); else down5.setTextColor(Color.BLACK);
            }
        });
        enter.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (enter.hasFocus()) enter.setTextColor(Color.WHITE); else enter.setTextColor(Color.BLACK);
            }
        });

        up1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[0]!=false){
                String x = (String) c1.getText();
                int r;
                r = Integer.parseInt(x);
                r++;
                if (r>9) r=0;
                c1.setText(String.valueOf(r));}
            }
        });
        up2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[1]!=false){
                String x = (String) c2.getText();
                int r;
                r = Integer.parseInt(x);
                r++;
                if (r>9) r=0;
                c2.setText(String.valueOf(r));
            }}
        });
        up3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[2]!=false){
                String x = (String) c3.getText();
                int r;
                r = Integer.parseInt(x);
                r++;
                if (r>9) r=0;
                c3.setText(String.valueOf(r));
            }}
        });
        up4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[3]!=false){
                String x = (String) c4.getText();
                int r;
                r = Integer.parseInt(x);
                r++;
                if (r>9) r=0;
                c4.setText(String.valueOf(r));}
            }
        });
        up5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[4]!=false){
                String x = (String) c5.getText();
                int r;
                r = Integer.parseInt(x);
                r++;
                if (r>9) r=0;
                c5.setText(String.valueOf(r));}
            }
        });


        down1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[0]!=false){
                String x = (String) c1.getText();
                int r;
                r = Integer.parseInt(x);
                r--;
                if (r<0) r=9;
                c1.setText(String.valueOf(r));}
            }
        });
        down2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[1]!=false){
                String x = (String) c2.getText();
                int r;
                r = Integer.parseInt(x);
                r--;
                if (r<0) r=9;
                c2.setText(String.valueOf(r));}
            }
        });
        down3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[2]!=false){
                String x = (String) c3.getText();
                int r;
                r = Integer.parseInt(x);
                r--;
                if (r<0) r=9;
                c3.setText(String.valueOf(r));}
            }
        });
        down4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[3]!=false){
                String x = (String) c4.getText();
                int r;
                r = Integer.parseInt(x);
                r--;
                if (r<0) r=9;
                c4.setText(String.valueOf(r));}
            }
        });
        down5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active[4]!=false){
                String x = (String) c5.getText();
                int r;
                r = Integer.parseInt(x);
                r--;
                if (r<0) r=9;
                c5.setText(String.valueOf(r));}
            }
        });



        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!endgame) {
                    for (int k = 0; k < 5; k++) {
                        im[k].setVisibility(View.VISIBLE);
                        im[k].setImageResource(R.drawable.loh);
                    }
                    ;


                    String x = (String) c1.getText();
                    vvod[0] = Integer.parseInt(x);
                    x = (String) c2.getText();
                    vvod[1] = Integer.parseInt(x);
                    x = (String) c3.getText();
                    vvod[2] = Integer.parseInt(x);
                    x = (String) c4.getText();
                    vvod[3] = Integer.parseInt(x);
                    x = (String) c5.getText();
                    vvod[4] = Integer.parseInt(x);


                    for (int i = 0; i < 5; i++) {

                        for (int k = 0; k < 5; k++) {
                            if (vvod[i] == chisla[k]) im[i].setImageResource(R.drawable.move);
                        }
                        ;
                        if (vvod[i] == chisla[i]) {
                            im[i].setImageResource(R.drawable.ok);
                            active[i] = false;
                        }
                        ;
                    }
                    ;


                    endgame = true;
                    tries++;
                    Ttry.setText(String.valueOf(tries));
                    for (int i = 0; i < 5; i++) {
                        if (active[i] != false) endgame = false;
                    }


                    if (endgame) {
                        long elapsedMillis = SystemClock.elapsedRealtime() - secs.getBase();
                        timer.setText(String.valueOf(elapsedMillis / 1000));
                        secs.stop();
                        LockImage.setImageResource(R.drawable.lockopen);
                    }

                }
            }
        });
    }
}
