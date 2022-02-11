package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String order = scan.nextLine();
	int count = Integer.parseInt(scan.nextLine());
	switch (order){
        case "coffee": System.out.printf("%.2f",count*1.50);break;
        case "water": System.out.printf("%.2f",count*1.00);break;
        case "coke": System.out.printf("%.2f",count*1.40);break;
        case "snacks": System.out.printf("%.2f",count*2.00);break;

    }
    }
}
