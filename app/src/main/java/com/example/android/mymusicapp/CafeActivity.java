package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CafeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        //Create an ArrayList of genres
        ArrayList<Genre> genres = new ArrayList<>();

        //genres.add(0, "Summer In New York", "Michael Franks")
        genres.add(new Genre("\"Moonglow\"                    PLAY", "For A Lifetime"));
        genres.add(new Genre("\"C'est De L'amour\"                    PLAY", "Marianne Feder"));
        genres.add(new Genre("\"J'ai deux amours\"                    PLAY", "Enzo Enzo"));
        genres.add(new Genre("\"Paris\"                    PLAY", "Marcio Faraco"));
        genres.add(new Genre("\"Plus bleu que tes yeux\"                    PLAY", "Jill Barber"));
        genres.add(new Genre("\"The Continental\"                    PLAY", "Blossom Dearie"));
        genres.add(new Genre("\"Hugos Howl\"                    PLAY", "Jacob Fischer"));
        genres.add(new Genre("\"Elle, Lui, Nous\"                    PLAY", "Lisa Ono"));
        genres.add(new Genre("\"Un Jour Comme Un Autre\"                    PLAY", "Stephane Grappelli"));
        genres.add(new Genre("\"Jitterbug Waltz\"                    PLAY", "Un Jour Comme Un Autre"));

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
