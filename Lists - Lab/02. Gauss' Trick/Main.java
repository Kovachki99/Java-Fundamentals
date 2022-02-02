package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        int [] list1= Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        for (int i = 0; i <list1.length/2.00; i++) {
            int first = list1[i];
            int last = list1[list1.length-1-i];
           if (i!=list1.length-1-i){ sum = first+last;} else {sum = first;}
            System.out.print(sum+" ");
        }

        }
}



