package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int meters = Integer.parseInt(scan.nextLine());
	double km = meters/1000.00;
	System.out.printf("%.2f",km);
    }
}
