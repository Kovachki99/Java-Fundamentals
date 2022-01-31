package com.company;

import java.util.Scanner;

public class Main {
    public static void matrix(int one){
        for (int i = 0; i <one ; i++) {
            for (int j = 0; j <one-1 ; j++) {
                System.out.print(one);System.out.print(" ");
            }
            System.out.println(one);
        }
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number = Integer.parseInt(scan.nextLine());
	matrix(number);

    }
}
