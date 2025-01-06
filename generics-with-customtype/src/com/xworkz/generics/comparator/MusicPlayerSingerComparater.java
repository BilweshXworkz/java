package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.MusicPlayer;

import java.util.Comparator;

public class MusicPlayerSingerComparater implements Comparator<MusicPlayer> {
    @Override
    public int compare(MusicPlayer o1, MusicPlayer o2) {
        return o1.getSinger().compareTo(o2.getSinger());
    }
}
