package com.xworkz.java8feature.runner;

public class AlphabetRunner {
    public static void main(String[] args) {
        Alphabet alp = () -> {
            return "Bilwesh";
        };

        System.out.println(alp.getAlphabet());
    }
}
