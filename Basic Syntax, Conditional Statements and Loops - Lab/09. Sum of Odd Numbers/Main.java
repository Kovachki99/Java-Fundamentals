package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	int count = 0;
	int number = Integer.parseInt(scan.nextLine());
        for (int i = 1; count < number ; i+=2) {
            count++;
            sum += i;
            System.out.println(i);



        }
        System.out.println("Sum: " + sum);
    }
}
