package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChilloutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        //Create an ArrayList of genres
        ArrayList<Genre> genres = new ArrayList<>();

        //genres.add(0, "Summer In New York", "Michael Franks")
        genres.add(new Genre("\"Don't Wake Me Up\"                PLAY", "DJ Shah"));
        genres.add(new Genre("\"Vanilla\"                             PLAY", "tyDi feat. Tania Zygar"));
        genres.add(new Genre("\"Why Don't We\"                      PLAY", "Mint Julep"));
        genres.add(new Genre("\"Attention\"                        PLAY", "Tenishia"));
        genres.add(new Genre("\"One More Day\"                    PLAY", "Sunlounger"));
        genres.add(new Genre("\"Time\"                              PLAY", "Hans Zimmer"));
        genres.add(new Genre("\"Soul Within Soul\"                    PLAY", "Anthya"));
        genres.add(new Genre("\"For A Lifetime\"                    PLAY", "Ascension"));
        genres.add(new Genre("\"No Pain\"                                    PLAY", "Manu Zain ft. Patrick Baker"));
        genres.add(new Genre("\"Hope never dies\"                       PLAY", "Solarsoul feat. Kristin Amarie"));

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
