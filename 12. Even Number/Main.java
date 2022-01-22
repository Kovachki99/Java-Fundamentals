package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double number = Double.parseDouble(scan.nextLine());
	while (!(number%2==0)){
	    System.out.println("Please write an even number.");
	    number= Double.parseDouble(scan.nextLine());
    }
	if (number>0&&number%2==0){
        System.out.printf("The number is: %.0f",number);
    }
	if (number<0&&number%2==0){System.out.printf("The number is: %.0f",Math.abs(number));}
    }
}
