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
        genres.add(new Genre(getString(R.string.triste), getString(R.string.under_water)));
        genres.add(new Genre(getString(R.string.jet_samba), getString(R.string.eliane)));
        genres.add(new Genre(getString(R.string.long_long), getString(R.string.dizzy)));
        genres.add(new Genre(getString(R.string.samba_de_uma), getString(R.string.nara)));
        genres.add(new Genre(getString(R.string.bluechanga), getString(R.string.ires)));
        genres.add(new Genre(getString(R.string.saudade_do), getString(R.string.bill_evans)));
        genres.add(new Genre(getString(R.string.my_love_waits), getString(R.string.duke_pearson)));
        genres.add(new Genre(getString(R.string.berimbau), getString(R.string.vinicius)));
        genres.add(new Genre(getString(R.string.samba_pro), getString(R.string.pedrinho)));
        genres.add(new Genre(getString(R.string.por_causa), getString(R.string.badem_powell)));

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
