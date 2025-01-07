package com.xworkz.java8feature.runner;

public class FaceBookRunner {
    public static void main(String[] args) {
        FaceBook faceBook = () -> {
            return true;
        };

        System.out.println(faceBook.isAccountCreated());
    }
}
