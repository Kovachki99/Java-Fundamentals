package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int snowballs = Integer.parseInt(scan.nextLine());
        if(!(snowballs<=0)){int snowballSnow = Integer.parseInt(scan.nextLine());;
        int snowballTime = Integer.parseInt(scan.nextLine());;
        int snowballQuality = Integer.parseInt(scan.nextLine());;
        long finale = Integer.MIN_VALUE;
        int currentSnow = 0;
        int currentTime = 0;
        int currentQuality = 0;
        for (int i = 1; i <= snowballs; i++) {
            long snowballValue = (long) Math.pow((snowballSnow/snowballTime),snowballQuality);
            if(snowballValue>=finale){finale = snowballValue;currentSnow=snowballSnow;currentTime=snowballTime;currentQuality=snowballQuality;}
            if(i!=snowballs){snowballSnow = Integer.parseInt(scan.nextLine());}
            if(i!=snowballs){snowballTime = Integer.parseInt(scan.nextLine());}
            if(i!=snowballs){snowballQuality = Integer.parseInt(scan.nextLine());}
        }
       System.out.printf("%d : %d = %d (%d)",currentSnow,currentTime,finale,currentQuality);
    }}
}
