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
        genres.add(new Genre(getString(R.string.nelsilenzio), getString(R.string.antonio)));
        genres.add(new Genre(getString(R.string.seasons), getString(R.string.favero)));
        genres.add(new Genre(getString(R.string.stairway), getString(R.string.scot_davis)));
        genres.add(new Genre(getString(R.string.peace_is), getString(R.string.burgette)));
        genres.add(new Genre(getString(R.string.rays_of_light), getString(R.string.eric_harry)));
        genres.add(new Genre(getString(R.string.ancient_albatross), getString(R.string.fiona_joy)));
        genres.add(new Genre(getString(R.string.man_of_grief), getString(R.string.jon_schmidt)));
        genres.add(new Genre(getString(R.string.souvenirs), getString(R.string.greg_starr)));
        genres.add(new Genre(getString(R.string.ave_maria), getString(R.string.chad_lawson)));
        genres.add(new Genre(getString(R.string.imagining), getString(R.string.janice_faber)));

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
