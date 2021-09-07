package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Put in Seconds: ");

        Scanner in = new Scanner(System.in);
        int tid = in.nextInt();
        int hour = tid /3600;
        int min = (tid % 3600 / 60);
        int sec = (tid % 3600 % 60);



        System.out.println(hour +" hour, "+ min + " minutes, "+ sec + " seconds.");


    }
}
