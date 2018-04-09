package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        //Create an ArrayList of genres
        ArrayList <Genre> genres = new ArrayList<>();

        //genres.add(0, "Summer In New York", "Michael Franks")
//genres.add(0, "Summer In New York", "Michael Franks")
        genres.add(new Genre("\"Rain Coat\"                    PLAY", "Kelly Sweet"));
        genres.add(new Genre("\"Let's Get It On\"              PLAY", "Audrey Martells"));
        genres.add(new Genre("\"Walk Through the Fire\"        PLAY", "Eric Marienthal"));
        genres.add(new Genre("\"I Really Like\"                PLAY", "The Jazzmasters"));
        genres.add(new Genre("\"Got To Let My Feelings Show\"      PLAY", "Bluey"));
        genres.add(new Genre("\"Jacky's Place\"                    PLAY", "Herb Alpert feat. Lani Hall"));
        genres.add(new Genre("\"Save Your Love For Me\"        PLAY", "Joe Sample"));
        genres.add(new Genre("\"Living Inside Your Love\"      PLAY", "Earl Klugh"));
        genres.add(new Genre("\"Anywhere You Wanna Go\"        PLAY", "Cagle & Nash"));
        genres.add(new Genre("\"Let's Stay Together\"          PLAY", "Seal"));

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
