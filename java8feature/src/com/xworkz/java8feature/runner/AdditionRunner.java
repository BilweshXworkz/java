package com.xworkz.java8feature.runner;

public class AdditionRunner {
    public static void main(String[] args) {
        Addition addition = (a, b) ->{
            return a+b;
        };
        
        int total = addition.Add(56, 45);
        System.out.println(total);
    }
}