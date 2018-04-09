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
        genres.add(new Genre(getString(R.string.dont_wake), getString(R.string.dj_shah)));
        genres.add(new Genre(getString(R.string.vanilla), getString(R.string.tania_zygar)));
        genres.add(new Genre(getString(R.string.why_dont_we), getString(R.string.mint_julep)));
        genres.add(new Genre(getString(R.string.attention), getString(R.string.tenishia)));
        genres.add(new Genre(getString(R.string.one_more_day), getString(R.string.sunlounger)));
        genres.add(new Genre(getString(R.string.day), getString(R.string.zimmer)));
        genres.add(new Genre(getString(R.string.soul_within_soul), getString(R.string.anthya)));
        genres.add(new Genre(getString(R.string.lifetime), getString(R.string.ascension)));
        genres.add(new Genre(getString(R.string.no_pain), getString(R.string.patrick_backer)));
        genres.add(new Genre(getString(R.string.hope_never_dies), getString(R.string.solarsoul)));

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
