package com.xworkz.generics.runner;

import com.xworkz.generics.customtype.Gmail;

import java.util.Collections;
import java.util.LinkedList;

public class GmailRunner {
    public static void main(String[] args) {
        LinkedList<Gmail> linkedList = new LinkedList<>();
        linkedList.add(new Gmail("arunvk@gmail.com", "shreya23@gmail.com", "Project meeting scheduled"));
        linkedList.add(new Gmail("shreya23@gmail.com", "coderhub@gmail.com", "Welcome to CoderHub!"));
        linkedList.add(new Gmail("arunvk@gmail.com", "devnews@gmail.com", "November Tech Insights Newsletter"));
        for (Object obj : linkedList) {
            System.out.println(obj);
        }

        Collections.sort(linkedList);
        System.out.println("===============================================");

        for (Object o : linkedList){
            System.out.println(o);
        }
    }
}
