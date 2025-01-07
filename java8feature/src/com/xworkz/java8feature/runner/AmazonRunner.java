package com.xworkz.java8feature.runner;

public class AmazonRunner {
    public static void main(String[] args) {
        Amazon amazon = () -> {
            return true;
        };

        System.out.println(amazon.isProductBooked());
    }
}
