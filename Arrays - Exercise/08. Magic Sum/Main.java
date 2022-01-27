package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[]list1 = Arrays
            .stream(scan.nextLine().split(" "))
            .mapToInt(e -> Integer.parseInt(e))
            .toArray();
	int sum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < list1.length ; i++) {
            for (int j = i+1; j <list1.length ; j++) {
                if(list1[i]+list1[j]==sum){System.out.printf("%d %d%n",list1[i],list1[j]);}
            }
        }
    }
}
