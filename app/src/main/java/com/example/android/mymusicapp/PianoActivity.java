package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PianoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        //Create an ArrayList of genres
        ArrayList<Genre> genres = new ArrayList<>();

        //genres.add(0, "Summer In New York", "Michael Franks")
        genres.add(new Genre("\"Nelsilenzio\"                    PLAY", "Antonio Marchello"));
        genres.add(new Genre("\"Seasons in a High Valley: Snow\"              PLAY", "Doug Favero"));
        genres.add(new Genre("\"Stairway to Heaven\"        PLAY", "Scott D. Davis"));
        genres.add(new Genre("\"Peace Is Always Beautiful\"                PLAY", "Craig Burdette"));
        genres.add(new Genre("\"Rays of Light, Signs of Life\"      PLAY", "Eric Harry"));
        genres.add(new Genre("\"Ancient Albatross\"                PLAY", "Fiona Joy Hawkins"));
        genres.add(new Genre("\"A Poor Wayfaring Man of Grief\"        PLAY", "Jon Schmidt"));
        genres.add(new Genre("\"Souvenirs\"      PLAY", "Greg Starr"));
        genres.add(new Genre("\"Ave Maria\"        PLAY", "Chad Lawson"));
        genres.add(new Genre("\"Imagining\"          PLAY", "Janice Faber"));

        //Adding genres to ArrayList to display for cross-navigation
        genres.add(new Genre("\"JAZZ GENRE\"                         FOLLOW", "click to navigate"));
        genres.add(new Genre("\"LOUNGE GENRE\"                       FOLLOW", "click to navigate"));
        genres.add(new Genre("\"CHILLOUT GENRE\"                     FOLLOW", "click to navigate"));
        genres.add(new Genre("\"BOSSA NOVA GENRE\"                   FOLLOW", "click to navigate"));
        genres.add(new Genre("\"CAFEE´DE PARIS GENRE\"               FOLLOW", "click to navigate"));
        genres.add(new Genre("\"SOLO PIANO GENRE\"                   FOLLOW", "click to navigate"));

        //Create a {@link ArrayAdapter}, whose data source is a list of Strings. The
        //adapter knows how to create layouts for each item in the list, using the
        //simple_list_item1.xml resource defined in the Android framework.
        //This listItem layout contains a single {@link TextView}, which the adapter will set
        //to display a single genre
        GenreAdapter adapter = new GenreAdapter(this, genres);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        //There should be a {@link ListView} with the view ID called "genre_list", which is
        //declared in the genre_list.xml file.
        ListView listView = findViewById(R.id.genre_list);

        //Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        //{@link ListView} will display list items for each genre in the list of genres.
        //Do this by calling the setAdapter method on the {@link ListView} object and pass in
        //1 argument, which is the {@link ArrayAdapter} with the variable name: "adapter"
        listView.setAdapter(adapter);
    }
}
