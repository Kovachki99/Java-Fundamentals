package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int currentElement = 0;
        int currentLoops = 0;
        int element = 0;
        int loops = Integer.MIN_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = i + 1; j < list1.length; j++) {
                if(list1[i]==list1[j]){
                    currentElement=list1[i];
                    currentLoops++;
                }else break;
            }
            if(currentLoops>loops){loops=currentLoops;element=currentElement;}
            currentLoops=0;
        }
            for (int j = 0; j <= loops ; j++) {
                System.out.print(element);if(j!=loops){System.out.print(" ");}
        }
    }
}
