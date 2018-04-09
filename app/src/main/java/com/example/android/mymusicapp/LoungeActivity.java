package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LoungeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre_list);

        //Create an ArrayList of genres
        ArrayList<Genre> genres = new ArrayList<>();

        //genres.add(0, "Summer In New York", "Michael Franks")
        genres.add(new Genre(getString(R.string.like_love), getString(R.string.sly)));
        genres.add(new Genre(getString(R.string.drink_to_forget), getString(R.string.orjan)));
        genres.add(new Genre(getString(R.string.minus_blue), getString(R.string.too_far)));
        genres.add(new Genre(getString(R.string.fever), getString(R.string.gerald)));
        genres.add(new Genre(getString(R.string.casa_del_como), getString(R.string.in_credo)));
        genres.add(new Genre(getString(R.string.habitat), getString(R.string.surya)));
        genres.add(new Genre(getString(R.string.dj_maretimo), getString(R.string.cosmopolitan)));
        genres.add(new Genre(getString(R.string.get_a_witness), getString(R.string.sofa_surfers)));
        genres.add(new Genre(getString(R.string.without_you), getString(R.string.gary_b)));
        genres.add(new Genre(getString(R.string.under_the_water), getString(R.string.left)));

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
