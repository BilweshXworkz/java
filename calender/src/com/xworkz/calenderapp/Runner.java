package com.xworkz.calenderapp;

public class Runner {
    static String str = null;
    public static void main(String[] args) {
//    callStack/ proportionate / Delegate
        System.out.println("Main Started");
//        m1();
        System.out.println("Main Ended");
    }
    public static void m1() throws Exception{
        System.out.println("m1 Start");
//        m2();
        System.out.println("m1 Ended");
    }

    public  static void m2() throws Exception{
        System.out.println("m2 Started ");
//        m3();
        System.out.println("m2 Ended");
    }
    public static void m3() throws Exception{
        System.out.println("m3 Started");
//        String str = null;
//        System.out.println(str.length());
//        String st = "12551D";
//        int intValue =
        System.out.println("m3 Ended");
    }
}
