package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int evenSum = 0;
	int oddSum = 0;
	int [] numbers = Arrays
            .stream(scan.nextLine().split(" "))
            .mapToInt(e -> Integer.parseInt(e))
            .toArray();
        for (int number : numbers) {
            if (number%2==0){
                evenSum+=number;
        } else {oddSum+=number;}
        }
        int diff = evenSum-oddSum;
        System.out.println(diff);
    }
}
