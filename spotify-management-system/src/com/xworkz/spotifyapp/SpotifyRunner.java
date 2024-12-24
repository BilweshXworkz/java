package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.management.SpotifyManagement;
import com.xworkz.spotifyapp.spotify.Spotify;

public class SpotifyRunner {
    public static void main(String[] args) {
        SpotifyManagement spotifyManagement = new SpotifyManagement();
        Spotify spotify = new Spotify();
        spotify.setSongName("Needhe Needhe");
        spotify.setSinger("Aavani Malhar");
        spotify.setMusicDirector("Hesham Abdul Wahab");
        spotify.setLyricist("Anantha Sriram");

        spotifyManagement.addDetails(spotify);
        spotifyManagement.getDetails();
    }
}
