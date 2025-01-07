package com.xworkz.java8feature.runner;

public class SubtractRunner {
    public static void main(String[] args) {
        Subtract sub = (a,b) -> {
            return a-b;
        };

        int result = sub.sub(50, 43);
        System.out.println(result);
    }
}
