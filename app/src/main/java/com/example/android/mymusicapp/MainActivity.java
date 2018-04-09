package com.example.android.mymusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content of the activity to use activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the jazz category
        TextView jazzView = findViewById(R.id.jazz);

        //Set the ClickListener on the jazzView
        jazzView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link JazzActivity
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);

                //Start the new activity
                startActivity(jazzIntent);
            }
        });

        //Find the View that shows the lounge category
        TextView loungeView = findViewById(R.id.lounge);

        //Set the ClickListener on the loungeView
        loungeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link LoungeActivity
                Intent loungeIntent = new Intent(MainActivity.this, LoungeActivity.class);

                //Start the new activity
                startActivity(loungeIntent);
            }
        });

        //Find the View that shows the chillout category
        TextView chilloutView = findViewById(R.id.chillout);

        //Set the ClickListener on the chilloutView
        chilloutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link ChilloutActivity
                Intent chilloutIntent = new Intent(MainActivity.this, ChilloutActivity.class);

                //Start the new activity
                startActivity(chilloutIntent);
            }
        });

        //Find the View that shows the bossa_nova category
        TextView bossaView = findViewById(R.id.bossa_nova);

        //Set the ClickListener on the bossaView
        bossaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link BossaActivity
                Intent bossaIntent = new Intent(MainActivity.this, BossaActivity.class);

                //Start the new activity
                startActivity(bossaIntent);
            }
        });

        //Find the View that shows the cafe_paris category
        TextView cafeView = findViewById(R.id.cafe_paris);

        //Set the ClickListener on the cafeView
        cafeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link CafeActivity
                Intent cafeIntent = new Intent(MainActivity.this, CafeActivity.class);

                //Start the new activity
                startActivity(cafeIntent);
            }
        });

        //Find the View that shows the solo_piano category
        TextView pianoView = findViewById(R.id.solo_piano);

        //Set the ClickListener on the pianoView
        pianoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Create a new intent to open the {@link PianoActivity
                Intent pianoIntent = new Intent(MainActivity.this, PianoActivity.class);

                //Start the new activity
                startActivity(pianoIntent);
            }
        });


    }
}
