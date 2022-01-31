package com.company;

import java.util.Scanner;

public class Main {
    public static double factorial(int first,int second){
        double firstFactorial = first;
        double secondFactorial = second;
        for (int i = 1; i < first ; i++) {
            firstFactorial=firstFactorial*i;
        }
        for (int i = 1; i < second ; i++) {
            secondFactorial=secondFactorial*i;
        }
        return firstFactorial/secondFactorial;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int first = Integer.parseInt(scan.nextLine());
	int second = Integer.parseInt(scan.nextLine());
	System.out.printf("%.2f",factorial(first, second));

    }
}
