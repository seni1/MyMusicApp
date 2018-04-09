package com.example.android.mymusicapp;

/**
 * Created by SeniKamara on 04.04.2018.
 * {@link Genre} represents a musical genre that the user wants to play.
 * It contains the name of the musical composition and the name of the artist performing
 * the composition.
 */

public class Genre {

    /** Name of the musical composition */
    private String mMusicalComposition;

    /** Name of the performing artist */
    private String mPerformingArtist;

    public Genre (String musicalComposition, String performingArtist) {

        mMusicalComposition = musicalComposition;
        mPerformingArtist = performingArtist;
    }

    /**
     * Get the musical composition method
     */

    public String getMusicalCompostion() {
        return mMusicalComposition;
    }

    /**
     * Get the performing artist method
     */

    public String getPerformingArtist() {
        return mPerformingArtist;
    }
}
