package com.example.android.mymusicapp;

/**
 * {@link GenreAdapter} is a {@link android.widget.ArrayAdapter} that can provide the layout for each
 * list based on a data source, which is a list of {@link com.example.android.mymusicapp.Genre} objects.
 * Created by SeniKamara on 04.04.2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate in the lists.

 */


public class GenreAdapter extends ArrayAdapter<Genre> {

    public GenreAdapter (Context context, ArrayList<Genre> genres) {
        //Here I initialize the ArrayAdapter's internal storage for the context and the list.
        //The second argument is used when the ArrayAdapter is populating a single TextView.
        //Because, this is a custom adapter for two TextViews, the adapter is not going to
        //use this second argument, so it can be any value. Here, I use 0.
        super(context, 0, genres);
    }

    /**
     * Provides a View of an AdapterView (ListView, GridView, etc.)
     * @param position The position is the list of data that should be displayed
     *                 in the listItemView
     * @param convertView The recycledView to populate
     * @param parent The parent ViewGroup that is used for inflation
     * @return The View for the position in the AdapterView.
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if the existing View is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        //Get the {@link Genre} object located at this position in the list
        Genre currentGenre = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID song_tv
        TextView songTextView = listItemView.findViewById(R.id.song_tv);

        //Get the Song name from the current Genre object and set this text
        //on the songTextView
        songTextView.setText(currentGenre.getMusicalCompostion());

        //Find the TextView in the list_item.xml layout with the ID artist_tv
        TextView artistTextView = listItemView.findViewById(R.id.artist_tv);

        //Get the Artist name from the current Genre object and set this text
        //on the artistTextView
        artistTextView.setText(currentGenre.getPerformingArtist());

        //Return the whole listItem layout (containing 2 TextViews)
        //so that it can be shown in the ListView
        return listItemView;
    }
}























