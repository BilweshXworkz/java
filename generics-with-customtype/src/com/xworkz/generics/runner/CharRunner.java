package com.xworkz.generics.runner;

import java.util.LinkedList;

public class CharRunner {
    public static void main(String[] args) {
        LinkedList<Character> alphabets = new LinkedList<>();
        alphabets.add('A');
        alphabets.add('B');
        alphabets.add('C');
        alphabets.add('D');
        for(Object a : alphabets)
            System.out.println(a);
    }
}
