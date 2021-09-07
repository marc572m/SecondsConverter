package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Put in Seconds: ");

        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        int sec = seconds % 60;
        int hour = seconds / 60;
        int min = hour % 60;

        hour = hour / 60;

        System.out.println(hour +" hour, "+ min + " minutes, "+ sec + " seconds.");


    }
}
