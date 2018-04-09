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
        genres.add(new Genre(getString(R.string.moonglow), getString(R.string.for_a_lifetime)));
        genres.add(new Genre(getString(R.string.cest_de_lamour), getString(R.string.feder)));
        genres.add(new Genre(getString(R.string.jai_deux), getString(R.string.enzo_enzo)));
        genres.add(new Genre(getString(R.string.paris), getString(R.string.marcio_faraco)));
        genres.add(new Genre(getString(R.string.plus_blue), getString(R.string.jill_barber)));
        genres.add(new Genre(getString(R.string.the_continental), getString(R.string.blossom)));
        genres.add(new Genre(getString(R.string.hugos_howl), getString(R.string.jacob_fischer)));
        genres.add(new Genre(getString(R.string.elle_lui_nous), getString(R.string.lisa_ono)));
        genres.add(new Genre(getString(R.string.un_jour), getString(R.string.grappelli)));
        genres.add(new Genre(getString(R.string.jitterburg), getString(R.string.un_jour_comme)));

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
