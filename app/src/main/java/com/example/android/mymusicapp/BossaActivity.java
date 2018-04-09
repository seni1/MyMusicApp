package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BossaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        //Create an ArrayList of genres
        ArrayList<Genre> genres = new ArrayList<>();

        //genres.add(0, "Summer In New York", "Michael Franks")
        genres.add(new Genre("\"Triste\"                    PLAY", "Under the Water"));
        genres.add(new Genre("\"Jet Samba\"                    PLAY", "Eliane Elias"));
        genres.add(new Genre("\"Long Long Summer\"              PLAY", "Dizzy Gillespie"));
        genres.add(new Genre("\"Samba De Uma Nota So\"                PLAY", "Nara Leão"));
        genres.add(new Genre("\"Bluechanga\"                    PLAY", "Fogueira Tres"));
        genres.add(new Genre("\"Saudade Do Brasil\"                    PLAY", "Bill Evans"));
        genres.add(new Genre("\"My Love Waits\"                    PLAY", "Duke Pearson"));
        genres.add(new Genre("\"Berimbau-Consola Ao\"                    PLAY", "Vinicius De Moraes"));
        genres.add(new Genre("\"Samba Pro Pedrinho\"                    PLAY", "Pedrinho Mattar Trio"));
        genres.add(new Genre("\"Por Causa De Voce\"                    PLAY", "Baden Powell"));

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
