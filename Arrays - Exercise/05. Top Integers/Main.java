package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int loops = 0;
	int loopsIf = 0;
        int[] list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int i = 0; i < list1.length ; i++) {
            for (int j = i+1; j <list1.length ; j++) {
                loops+=1;
                if(list1[i]>list1[j]){loopsIf++;}
                //if(i==list1.length-1){System.out.print(list1[i]);}
            }
            if(loops==loopsIf){System.out.print(list1[i]);if(i!=list1.length-1){System.out.print(" ");}}
            loops=0;
            loopsIf=0;
        }
    }
}
