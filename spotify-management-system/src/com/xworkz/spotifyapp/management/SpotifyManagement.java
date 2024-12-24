package com.xworkz.spotifyapp.management;

import com.xworkz.spotifyapp.spotify.Spotify;

public class SpotifyManagement {

    Spotify spotify;

    public boolean addDetails(Spotify spotify){
        boolean isAdded = false;
        if(spotify != null){
            if(spotify.getSongName() != null){
                this.spotify = spotify;
            }
            else{
                System.out.println("Please enter the details");
            }
        }
        return isAdded;
    }

    public void getDetails(){
        System.out.println("Song : "+spotify.getSongName());
        System.out.println("Singer : "+spotify.getSinger());
        System.out.println("Music Director : "+spotify.getMusicDirector());
        System.out.println("Lyricist : "+spotify.getLyricist());
    }
}
