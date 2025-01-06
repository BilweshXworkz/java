package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.MusicPlayerSingerComparater;
import com.xworkz.generics.comparator.MusicPlayerTitleComparator;
import com.xworkz.generics.customtype.MusicPlayer;

import java.util.Collections;
import java.util.LinkedList;

public class MusicRunner {
    public static void main(String[] args) {
        LinkedList<MusicPlayer> musicPlayers = new LinkedList<>();
        musicPlayers.add(new MusicPlayer("Inkem Inkem", "Sid Sriram", 4.08f));
        musicPlayers.add(new MusicPlayer("Butta Bomma", "Armaan Malik", 3.17f));
        musicPlayers.add(new MusicPlayer("Samajavaragamana", "Sid Sriram", 3.48f));
        for (Object obj : musicPlayers)
            System.out.println(obj);

        Collections.sort(musicPlayers);
        System.out.println("============================");

        for (Object o : musicPlayers)
            System.out.println(o);

        Collections.sort(musicPlayers, new MusicPlayerTitleComparator());
        System.out.println("============================");

        for (Object o1 : musicPlayers)
            System.out.println(o1);

        Collections.sort(musicPlayers, new MusicPlayerSingerComparater());
        System.out.println("============================");

        for (Object o2 : musicPlayers)
            System.out.println(o2);
    }
}
