package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.MusicPlayer;

import java.util.Comparator;

public class MusicPlayerTitleComparator implements Comparator<MusicPlayer> {
    @Override
    public int compare(MusicPlayer o1, MusicPlayer o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
