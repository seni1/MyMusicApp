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
        genres.add(new Genre(getString(R.string.rain_coat), getString(R.string.kelly_sweet)));
        genres.add(new Genre(getString(R.string.get_it_on), getString(R.string.audrey)));
        genres.add(new Genre(getString(R.string.walk_through), getString(R.string.marienthal)));
        genres.add(new Genre(getString(R.string.really_like), getString(R.string.jazzmaster)));
        genres.add(new Genre(getString(R.string.got_to), getString(R.string.bluey)));
        genres.add(new Genre(getString(R.string.jackys_place), getString(R.string.herb_alpert)));
        genres.add(new Genre(getString(R.string.save_your_love), getString(R.string.joe_sample)));
        genres.add(new Genre(getString(R.string.living_inside), getString(R.string.earl_klugh)));
        genres.add(new Genre(getString(R.string.anywhere), getString(R.string.cagle_nash)));
        genres.add(new Genre(getString(R.string.lets_stay), getString(R.string.seal)));

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
